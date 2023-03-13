package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "ItemTransactionID")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemTransactionID implements Serializable {

    @JacksonXmlProperty(localName = "ItemID")
    public String itemID;

    @JacksonXmlProperty(localName = "OrderLineItemID")
    public String orderLineItemID;

    @JacksonXmlProperty(localName = "SKU")
    public String sKU;

    @JacksonXmlProperty(localName = "TransactionID")
    public String transactionID;
}
