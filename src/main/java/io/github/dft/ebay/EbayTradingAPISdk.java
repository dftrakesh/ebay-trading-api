package io.github.dft.ebay;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import io.github.dft.ebay.model.EbayCredentials;
import io.github.dft.ebay.model.token.AccessToken;
import io.github.dft.ebay.model.token.AccessTokenRequest;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.Data;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Data
public class EbayTradingAPISdk {

    private XmlMapper xmlMapper;
    private EbayToken ebayToken;
    private LocalDateTime expireDate;
    protected final HttpClient client;
    protected final EbayCredentials ebayCredentials;

    public EbayTradingAPISdk(EbayCredentials ebayCredentials) {
        this.xmlMapper = new XmlMapper();
        this.xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.ebayToken = new EbayToken(ebayCredentials.getEBayAuthToken());
        this.ebayCredentials = ebayCredentials;
        this.client = HttpClient.newHttpClient();
        this.expireDate = LocalDateTime.now().minusMinutes(10);
    }

    @SneakyThrows
    public String toStr(Object t) {
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        return xmlMapper.writeValueAsString(t);
    }

    synchronized EbayToken refreshToken() {
        if (expireDate.isBefore(LocalDateTime.now())) {
            AccessToken accessToken = new TokenAPI().getAccessTokenFromRefreshToken(accessTokenRequestPayload());
            this.expireDate = LocalDateTime.now().plusSeconds(accessToken.getExpiresIn());
            ebayToken.setEBayAuthToken(accessToken.getAccessToken());
        }
        return ebayToken;
    }

    public AccessTokenRequest accessTokenRequestPayload() {
        return AccessTokenRequest.builder()
                                 .refreshToken(ebayCredentials.getRefreshToken())
                                 .appId(ebayCredentials.getAppName())
                                 .certId(ebayCredentials.getCertName())
                                 .scopes(ebayCredentials.getScopes())
                                 .build();
    }

    @SneakyThrows
    public <T> T  toObj(String response,Class<T> var) {
        return xmlMapper.readValue(response, var);
    }

    @SneakyThrows
    public <T> T getRequestWrapped(HttpRequest request, HttpResponse.BodyHandler<T> handler) {
        try {
            return (T) ((HttpResponse) this.client.sendAsync(request, handler).thenComposeAsync((response) -> {
                return this.tryResend(this.client, request, handler, response, 1);
            }).get()).body();
        } catch (Throwable var4) {
            throw var4;
        }
    }

    @SneakyThrows
    public <T> CompletableFuture<HttpResponse<T>> tryResend(HttpClient client, HttpRequest request, HttpResponse.BodyHandler<T> handler, HttpResponse<T> resp, int count) {
        try {
            if (resp.statusCode() == 429 && count < 50) {
                Thread.sleep(15000L);
                return client.sendAsync(request, handler).thenComposeAsync((response) -> {
                    return this.tryResend(client, request, handler, response, count + 1);
                });
            } else {
                return CompletableFuture.completedFuture(resp);
            }
        } catch (Throwable var7) {
            throw var7;
        }
    }

    @SneakyThrows
    protected HttpRequest get(URI uri) {
        return HttpRequest.newBuilder(uri)
                .header("Authorization", "Bearer " + ebayCredentials.getEBayAuthToken())
                .header("Accept", "application/json")
                .GET()
                .build();
    }

    @SneakyThrows
    protected URI addParameters(URI uri, HashMap<String, String> params) {
        String query = uri.getQuery();
        StringBuilder builder = new StringBuilder();
        if (query != null)
            builder.append(query);

        for (Map.Entry<String, String> entry : params.entrySet()) {
            String keyValueParam = entry.getKey() + "=" + entry.getValue();
            if (!builder.toString().isEmpty())
                builder.append("&");
            builder.append(keyValueParam);
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), builder.toString(), uri.getFragment());
    }
}