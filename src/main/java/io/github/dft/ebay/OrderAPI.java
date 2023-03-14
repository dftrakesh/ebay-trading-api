package io.github.dft.ebay;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.order.GetOrdersRequest;
import io.github.dft.ebay.model.order.GetOrdersResponse;
import io.github.dft.ebay.model.order.transactions.itemtransaction.GetItemTransactionsRequest;
import io.github.dft.ebay.model.order.transactions.itemtransaction.GetItemTransactionsResponse;
import io.github.dft.ebay.model.order.transactions.ordertransaction.GetOrderTransactionsRequest;
import io.github.dft.ebay.model.order.transactions.ordertransaction.GetOrderTransactionsResponse;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dft.ebay.constant.ConstantCodes.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderAPI extends EbayTradingAPISdk {

    public OrderAPI(RequesterCredentials requesterCredentials) {
        super(requesterCredentials);
    }

    public GetOrdersResponse getOrders(GetOrdersRequest getOrderRequest) throws IOException, InterruptedException, URISyntaxException {
        getOrderRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getOrderRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_ORDERS)
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
        return toObj(strResponse, GetOrdersResponse.class);
    }

    public GetItemTransactionsResponse GetItemTransactions(GetItemTransactionsRequest getItemTransactionsRequest) throws IOException, InterruptedException, URISyntaxException {
        getItemTransactionsRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getItemTransactionsRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_ITEM_TRANSACTIONS)
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
        return toObj(strResponse, GetItemTransactionsResponse.class);
    }

    public GetOrderTransactionsResponse GetOrderTransactions(GetOrderTransactionsRequest getOrderTransactionsRequest) throws IOException, InterruptedException, URISyntaxException {
        getOrderTransactionsRequest.setRequesterCredentials(getEbayToken());
        String payload = toStr(getOrderTransactionsRequest);

        HttpRequest request = HttpRequest.newBuilder(new URI(XML_API_PRODUCTION_GATEWAY))
                .header(HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME, EBAY_API_CALL_NAME_GET_ORDER_TRANSACTIONS)
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
        return toObj(strResponse, GetOrderTransactionsResponse.class);
    }
}