package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SalesTax {

    @JacksonXmlProperty(localName = "SalesTaxAmount")
    private String salesTaxAmount;

    @JacksonXmlProperty(localName = "SalesTaxPercent")
    private String salesTaxPercent;

    @JacksonXmlProperty(localName = "SalesTaxState")
    private String salesTaxState;

    @JacksonXmlProperty(localName = "ShippingIncludedInTax")
    private String shippingIncludedInTax;
}
