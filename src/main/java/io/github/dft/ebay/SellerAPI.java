package io.github.dft.ebay;

import io.github.dft.ebay.model.AccessCredential;
import io.github.dft.ebay.model.seller.GetSellerListRequest;
import io.github.dft.ebay.model.seller.GetSellerListResponse;
import io.github.dft.ebay.model.seller.GranularityLevelCodeType;
import io.github.dft.ebay.model.seller.Pagination;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SellerAPI extends EbayTradingAPISdk {

    private final String HTTP_HEADER_CONTENT_TYPE_VALUE = "text/xml";
    private final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private final String EBAY_API_CALL_NAME_GET_SELLER_LIST = "GetSellerList";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    private final String XML_API_PRODUCTION_GATEWAY = "https://api.ebay.com/ws/api.dll";
    private final String HTTP_HEADER_KEY_X_EBAY_API_SITEID = "X-EBAY-API-SITEID";
    private final String HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";

    public SellerAPI(AccessCredential accessCredential) {
        super(accessCredential);
    }

    @SneakyThrows
    public GetSellerListResponse getItems(GetSellerListRequest getSellerListRequest) {
        getSellerListRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getSellerListRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_SELLER_LIST)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, accessCredential.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, accessCredential.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, accessCredential.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, accessCredential.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, accessCredential.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();

        return toObj(strResponse, GetSellerListResponse.class);
    }

    @SneakyThrows
    public GetSellerListResponse getItems(Calendar startTimeFrom, Calendar startTimeTo, int iPage) {
        GetSellerListRequest getSellerListRequest = new GetSellerListRequest();
        getSellerListRequest.setEndTimeFrom(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000'Z'").format(startTimeFrom.getTime()));
        getSellerListRequest.setEndTimeTo(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000'Z'").format(startTimeTo.getTime()));
        getSellerListRequest.setGranularityLevel(GranularityLevelCodeType.Coarse);
        getSellerListRequest.setIncludeVariations(true);
        Pagination pagination = new Pagination();
        pagination.setPageNumber(iPage);
        getSellerListRequest.setPagination(pagination);

        return getItems(getSellerListRequest);
    }
}
