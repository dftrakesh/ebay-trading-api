package io.github.dft.ebay;

import io.github.dft.ebay.model.EbayCredentials;
import io.github.dft.ebay.model.finance.GetTransactionResponse;
import io.github.dft.ebay.model.handler.JsonBodyHandler;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

public class FinanceAPI extends EbayTradingAPISdk {

    private final String API_PRODUCTION_GATEWAY = "https://apiz.ebay.com/sell/finances/v1/transaction";

    public FinanceAPI(EbayCredentials ebayCredentials) {
        super(ebayCredentials);
    }

    @SneakyThrows
    public GetTransactionResponse getTransaction(HashMap<String, String> params) {
        URI uri = new URI(new StringBuilder().append(API_PRODUCTION_GATEWAY).toString());
        uri = addParameters(uri, params);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<GetTransactionResponse> handler = new JsonBodyHandler<>(GetTransactionResponse.class);
        return getRequestWrapped(request, handler);
    }
}
