package io.github.dft.ebay;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.item.GetItemRequest;
import io.github.dft.ebay.model.item.GetItemResponse;
import io.github.dft.ebay.model.token.EbayToken;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dft.ebay.constant.ConstantCodes.*;

public class ItemAPI extends EbayTradingAPISdk {
    private final HttpClient client;

    public ItemAPI(RequesterCredentials requesterCredentials) {
        super(requesterCredentials);
        client = HttpClient.newHttpClient();
    }

    public GetItemResponse getItem(GetItemRequest getItemRequest) throws URISyntaxException, IOException, InterruptedException {
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
}
