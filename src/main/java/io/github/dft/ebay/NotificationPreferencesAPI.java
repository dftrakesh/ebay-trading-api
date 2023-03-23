package io.github.dft.ebay;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.dft.ebay.model.AccessCredential;
import io.github.dft.ebay.model.notification.SetNotificationPreferencesRequest;
import io.github.dft.ebay.model.notification.SetNotificationPreferencesResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationPreferencesAPI extends EbayTradingAPISdk {

    private final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private final String HTTP_HEADER_CONTENT_TYPE_VALUE = "text/xml";
    private final String HTTP_HEADER_KEY_X_EBAY_API_SITEID = "X-EBAY-API-SITEID";
    private final String HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL = "0";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    private final String XML_API_PRODUCTION_GATEWAY = "https://api.ebay.com/ws/api.dll";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL = "X-EBAY-API-DETAIL-LEVEL";
    private final String EBAY_API_CALL_NAME_SET_NOTIFICATION_PREFERENCES = "SetNotificationPreferences";
    private final String HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";

    public NotificationPreferencesAPI(AccessCredential accessCredential) {
        super(accessCredential);
    }

    @SneakyThrows
    public SetNotificationPreferencesResponse setNotificationPreferences(SetNotificationPreferencesRequest setNotificationPreferencesRequest) {
        setNotificationPreferencesRequest.setRequesterCredentials(getEbayToken());
        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_SET_NOTIFICATION_PREFERENCES)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, accessCredential.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, accessCredential.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, accessCredential.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, accessCredential.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL, HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL)
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, accessCredential.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(toStr(setNotificationPreferencesRequest)))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, SetNotificationPreferencesResponse.class);
    }
}