package io.github.dft.ebay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.notification.SetNotificationPreferencesRequest;
import io.github.dft.ebay.model.order.GetOrdersRequest;
import io.github.dft.ebay.model.order.GetOrdersResponse;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dft.ebay.constant.ConstantCodes.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationPreferencesAPI extends EbayTradingAPISdk {

    public NotificationPreferencesAPI(RequesterCredentials requesterCredentials) {
        super(requesterCredentials);
    }

    @SneakyThrows
    public String setNotificationPreferences(SetNotificationPreferencesRequest setNotificationPreferencesRequest) {
        setNotificationPreferencesRequest.setRequesterCredentials(new EbayToken(requesterCredentials.getEBayAuthToken()));
        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_SET_NOTIFICATION_PREFERENCES)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, requesterCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, requesterCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, requesterCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, requesterCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL, HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL)
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, requesterCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)

                .POST(HttpRequest.BodyPublishers.ofString(toStr(setNotificationPreferencesRequest)))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
        //String strResponse = response.body();
     //   return toObj(strResponse, GetOrdersResponse.class);
    }
}