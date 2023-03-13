package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class TaxOnSubtotalAmount {

    @JacksonXmlProperty(localName = "currencyID")
    public String currencyID;

    @JacksonXmlText
    public Double text;
}
