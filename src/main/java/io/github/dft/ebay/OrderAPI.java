package io.github.dft.ebay;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.dft.ebay.model.EbayCredentials;
import io.github.dft.ebay.model.order.GetOrdersRequest;
import io.github.dft.ebay.model.order.GetOrdersResponse;
import io.github.dft.ebay.model.order.transactions.itemtransaction.GetItemTransactionsRequest;
import io.github.dft.ebay.model.order.transactions.itemtransaction.GetItemTransactionsResponse;
import io.github.dft.ebay.model.order.transactions.ordertransaction.GetOrderTransactionsRequest;
import io.github.dft.ebay.model.order.transactions.ordertransaction.GetOrderTransactionsResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderAPI extends EbayTradingAPISdk {

    private final String EBAY_API_CALL_NAME_GET_ORDERS = "GetOrders";
    private final String HTTP_HEADER_CONTENT_TYPE_VALUE = "text/xml";
    private final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private final String HTTP_HEADER_KEY_X_EBAY_API_SITEID = "X-EBAY-API-SITEID";
    private final String HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    private final String HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    private final String XML_API_PRODUCTION_GATEWAY = "https://api.ebay.com/ws/api.dll";
    private final String EBAY_API_CALL_NAME_GET_ITEM_TRANSACTIONS = "GetItemTransactions";
    private final String EBAY_API_CALL_NAME_GET_ORDER_TRANSACTIONS = "GetOrderTransactions";
    private final String HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";


    public OrderAPI(EbayCredentials ebayCredentials) {
        super(ebayCredentials);
    }

    @SneakyThrows
    public GetOrdersResponse getOrders(GetOrdersRequest getOrderRequest) {
        getOrderRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getOrderRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_ORDERS)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, ebayCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, ebayCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, ebayCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, ebayCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, ebayCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, GetOrdersResponse.class);
    }

    @SneakyThrows
    public GetItemTransactionsResponse GetItemTransactions(GetItemTransactionsRequest getItemTransactionsRequest) {
        getItemTransactionsRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getItemTransactionsRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_ITEM_TRANSACTIONS)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, ebayCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, ebayCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, ebayCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, ebayCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, ebayCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, GetItemTransactionsResponse.class);
    }

    @SneakyThrows
    public GetOrderTransactionsResponse GetOrderTransactions(GetOrderTransactionsRequest getOrderTransactionsRequest) {
        getOrderTransactionsRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getOrderTransactionsRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_ORDER_TRANSACTIONS)
                .header(HTTP_HEADER_KEY_X_EBAY_API_APP_NAME, ebayCredentials.getAppName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME, ebayCredentials.getDevName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME, ebayCredentials.getCertName())
                .header(HTTP_HEADER_KEY_X_EBAY_API_SITEID, ebayCredentials.getSiteID())
                .header(HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL, ebayCredentials.getApiCompatibilityLevel())
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_VALUE)
                .POST(HttpRequest.BodyPublishers.ofString(payload))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return toObj(strResponse, GetOrderTransactionsResponse.class);
    }
}