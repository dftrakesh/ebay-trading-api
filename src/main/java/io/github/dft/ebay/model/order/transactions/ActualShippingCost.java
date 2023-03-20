package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.io.Serializable;

@Data
public class ActualShippingCost implements Serializable {
    @JacksonXmlProperty(localName = "currencyID")
    private String currencyID;

    @JacksonXmlText
    private Double text;
}