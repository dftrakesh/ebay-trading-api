package io.github.dft.ebay;

import io.github.dft.ebay.model.AccessCredential;
import io.github.dft.ebay.model.fetchtoken.FetchTokenRequest;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchToken extends EbayTradingAPISdk {

    private final String HTTP_HEADER_CONTENT_TYPE_VALUE = "text/xml";
    private final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private final String EBAY_API_CALL_NAME_FETCH_TOKEN = "FetchToken";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    private final String XML_API_PRODUCTION_GATEWAY = "https://api.ebay.com/ws/api.dll";
    private final String HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";

    @SneakyThrows
    public FetchToken(AccessCredential accessCredentials) {
        super(accessCredentials);
    }

    @SneakyThrows
    public String fetchToken(FetchTokenRequest fetchTokenRequest) {

        String payload = toStr(fetchTokenRequest);
        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, accessCredential.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, accessCredential.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, accessCredential.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, accessCredential.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_FETCH_TOKEN)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();

        return client.send(request,
                HttpResponse.BodyHandlers.ofString()).body();
    }
}
