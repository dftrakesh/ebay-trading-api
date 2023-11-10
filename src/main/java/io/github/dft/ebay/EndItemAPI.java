package io.github.dft.ebay;


import io.github.dft.ebay.model.EbayCredentials;
import io.github.dft.ebay.model.enditem.EndItemRequest;
import io.github.dft.ebay.model.enditem.EndItemResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EndItemAPI extends EbayTradingAPISdk {

    private final String EBAY_API_CALL_NAME_END_ITEM = "EndItem";
    private final String HTTP_HEADER_CONTENT_TYPE_VALUE = "text/xml";
    private final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private final String HTTP_HEADER_KEY_X_EBAY_API_SITEID = "X-EBAY-API-SITEID";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    private final String XML_API_PRODUCTION_GATEWAY = "https://api.ebay.com/ws/api.dll";
    private final String HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";

    public EndItemAPI(EbayCredentials ebayCredentials) {
        super(ebayCredentials);
    }

    @SneakyThrows
    public EndItemResponse deleteItem(EndItemRequest endItemRequest) {
        endItemRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(endItemRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                                         .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_END_ITEM)
                                         .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, ebayCredentials.getAppName())
                                         .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, ebayCredentials.getDevName())
                                         .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, ebayCredentials.getCertName())
                                         .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, ebayCredentials.getSiteID())
                                         .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, ebayCredentials.getApiCompatibilityLevel())
                                         .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                                         .POST(HttpRequest.BodyPublishers.ofString(payload))
                                         .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return toObj(response.body(), EndItemResponse.class);
    }
}