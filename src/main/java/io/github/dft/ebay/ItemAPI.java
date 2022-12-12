package io.github.dft.ebay;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.item.*;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dft.ebay.constant.ConstantCodes.*;

@Log4j2
public class ItemAPI extends EbayTradingAPISdk {

    public ItemAPI(RequesterCredentials requesterCredentials) {
        super(requesterCredentials);
    }

    @SneakyThrows
    public GetItemResponse getItem(GetItemRequest getItemRequest) {
        getItemRequest.setRequesterCredentials(new EbayToken(requesterCredentials.getEBayAuthToken()));
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
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return xmlMapper.readValue(strResponse, GetItemResponse.class);
    }

    @SneakyThrows
    public ReviseItemResponse reviseItem(ReviseItemRequest reviseItemRequest) {
        String payload = toStr(reviseItemRequest);
        log.debug("reviseItem payload: {}", payload);
        reviseItemRequest.setRequesterCredentials(new EbayToken(requesterCredentials.getEBayAuthToken()));
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
        log.debug("reviseItem strResponse: {}", strResponse);
        return toObj(strResponse, ReviseItemResponse.class);
    }

    @SneakyThrows
    public ReviseFixedPriceItemResponse reviseFixedPrice(ReviseFixedPriceItemRequest reviseFixedPriceItemRequest){
        reviseFixedPriceItemRequest.setRequesterCredentials(new EbayToken(requesterCredentials.getEBayAuthToken()));
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
    public AddFixedPriceItemResponse addFixedPriceItem(AddFixedPriceItemRequest addFixPriceItemRequest){
        addFixPriceItemRequest.setRequesterCredentials(new EbayToken(requesterCredentials.getEBayAuthToken()));
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
