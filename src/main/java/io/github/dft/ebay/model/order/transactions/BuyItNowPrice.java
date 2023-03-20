package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class BuyItNowPrice {

    @JacksonXmlProperty(isAttribute = true,localName = "currencyID")
    private String currencyID;

    @JacksonXmlText
    private Double text;
}
