package io.github.dft.ebay;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.order.GetOrdersResponse;
import lombok.Data;
import lombok.SneakyThrows;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

@Data
public class EbayTradingAPISdk {

    protected final RequesterCredentials requesterCredentials;
    private XmlMapper xmlMapper;
    protected final HttpClient client;

    public EbayTradingAPISdk(RequesterCredentials requesterCredentials) {
        this.xmlMapper = new XmlMapper();
        this.xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.requesterCredentials = requesterCredentials;
        this.client = HttpClient.newHttpClient();
    }

    @SneakyThrows
    public String toStr(Object t) {
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);

        String strReturn = xmlMapper.writeValueAsString(t);
        return strReturn;
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
}
