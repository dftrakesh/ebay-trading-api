package io.github.dft.ebay;

import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.fetchtoken.FetchTokenRequest;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dft.ebay.constant.ConstantCodes.*;

public class FetchToken extends EbayTradingAPISdk {

    @SneakyThrows
    public FetchToken(RequesterCredentials accessCredentials) {
        super(accessCredentials);
    }

    @SneakyThrows
    public String fetchToken(FetchTokenRequest fetchTokenRequest) {

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

        return client.send(request,
                HttpResponse.BodyHandlers.ofString()).body();
    }


}
