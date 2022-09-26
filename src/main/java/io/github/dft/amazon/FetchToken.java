package io.github.dft.amazon;

import io.github.dft.amazon.model.RequesterCredentials;
import io.github.dft.amazon.model.fetchtoken.FetchTokenRequest;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dft.amazon.constantcode.ConstantCodes.*;

public class FetchToken extends EbayTradingAPISdk {

    private final HttpClient client;

    @SneakyThrows
    public FetchToken(RequesterCredentials accessCredentials) {
        super(accessCredentials);
        client = HttpClient.newHttpClient();
    }

    @SneakyThrows
    public void fetchToken(FetchTokenRequest fetchTokenRequest) {

        String payload = toStr(fetchTokenRequest);
        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, requesterCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, requesterCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, requesterCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, requesterCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_FETCH_TOKEN)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
