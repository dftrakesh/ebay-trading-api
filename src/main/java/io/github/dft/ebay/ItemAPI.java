package io.github.dft.ebay;


import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.item.*;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ItemAPI extends EbayTradingAPISdk {

    private final String EBAY_API_CALL_NAME_GET_ITEM = "GetItem";
    private final String HTTP_HEADER_CONTENT_TYPE_VALUE = "text/xml";
    private final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private final String EBAY_API_CALL_NAME_REVISE_ITEM = "ReviseItem";
    private final String HTTP_HEADER_KEY_X_EBAY_API_SITEID = "X-EBAY-API-SITEID";
    private final String HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL = "0";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    private final String EBAY_API_CALL_NAME_ADD_FIXED_PRICE_ITEM = "AddFixedPriceItem";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    private final String XML_API_PRODUCTION_GATEWAY = "https://api.ebay.com/ws/api.dll";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL = "X-EBAY-API-DETAIL-LEVEL";
    private final String EBAY_API_CALL_NAME_REVISE_FIXED_PRICE_ITEM = "ReviseFixedPriceItem";
    private final String HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";

    public ItemAPI(RequesterCredentials requesterCredentials) {
        super(requesterCredentials);
    }

    @SneakyThrows
    public GetItemResponse getItem(GetItemRequest getItemRequest) {
        getItemRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getItemRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_ITEM)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, requesterCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, requesterCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, requesterCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, requesterCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, requesterCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, GetItemResponse.class);
    }

    @SneakyThrows
    public ReviseItemResponse reviseItem(ReviseItemRequest reviseItemRequest) {
        String payload = toStr(reviseItemRequest);
        reviseItemRequest.setRequesterCredentials(getEbayToken());

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_REVISE_ITEM)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, requesterCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, requesterCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, requesterCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, requesterCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL, HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL)
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, requesterCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, ReviseItemResponse.class);
    }

    @SneakyThrows
    public ReviseFixedPriceItemResponse reviseFixedPrice(ReviseFixedPriceItemRequest reviseFixedPriceItemRequest) {
        reviseFixedPriceItemRequest.setRequesterCredentials(getEbayToken());

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_REVISE_FIXED_PRICE_ITEM)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, requesterCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, requesterCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, requesterCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, requesterCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL, HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL)
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, requesterCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(toStr(reviseFixedPriceItemRequest)))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, ReviseFixedPriceItemResponse.class);
    }

    @SneakyThrows
    public AddFixedPriceItemResponse addFixedPriceItem(AddFixedPriceItemRequest addFixPriceItemRequest) {
        addFixPriceItemRequest.setRequesterCredentials(getEbayToken());

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_ADD_FIXED_PRICE_ITEM)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, requesterCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, requesterCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, requesterCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, requesterCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL, HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL)
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, requesterCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(toStr(addFixPriceItemRequest)))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, AddFixedPriceItemResponse.class);
    }
}
