package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class TotalTaxAmount {

    @JacksonXmlProperty(localName = "currencyID")
    private String currencyID;

    @JacksonXmlText
    private Double text;
}
