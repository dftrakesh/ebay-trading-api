package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Transaction implements Serializable {

    @JacksonXmlProperty(localName = "TransactionID")
    private String transactionID;

    @JacksonXmlProperty(localName = "TransactionPrice")
    private Double transactionPrice;

    @JacksonXmlProperty(localName = "QuantityPurchased")
    private Integer quantityPurchased;

    @JacksonXmlProperty(localName = "Item")
    private Item item;

    @JacksonXmlProperty(localName = "Variation")
    private Variation variation;

}
