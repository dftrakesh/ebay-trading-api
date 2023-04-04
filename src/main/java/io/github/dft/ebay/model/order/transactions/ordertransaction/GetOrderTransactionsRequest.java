package io.github.dft.ebay.model.order.transactions.ordertransaction;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.DetailLevelCodeType;
import io.github.dft.ebay.model.order.transactions.ItemTransactionIDArray;
import io.github.dft.ebay.model.order.transactions.OrderIDArray;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOrderTransactionsRequest {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken requesterCredentials;

    @JacksonXmlProperty(localName = "IncludeFinalValueFees")
    private boolean includeFinalValueFees;

    @JacksonXmlProperty(localName = "ItemTransactionIDArray")
    private ItemTransactionIDArray itemTransactionIDArray;

    @JacksonXmlProperty(localName = "OrderIDArray")
    private OrderIDArray orderIDArray;

    @JacksonXmlProperty(localName = "DetailLevel")
    private DetailLevelCodeType detailLevel;
}
