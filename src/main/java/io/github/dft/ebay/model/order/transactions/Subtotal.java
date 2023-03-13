package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class Subtotal {
    @JacksonXmlProperty(localName = "currencyID")
    public String currencyID;

    @JacksonXmlText
    public Double text;
}
