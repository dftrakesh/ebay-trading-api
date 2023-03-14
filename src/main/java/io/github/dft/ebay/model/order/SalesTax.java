package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SalesTax {

    @JacksonXmlProperty(localName = "SalesTaxAmount")
    public String salesTaxAmount;

    @JacksonXmlProperty(localName = "SalesTaxPercent")
    public String salesTaxPercent;

    @JacksonXmlProperty(localName = "SalesTaxState")
    public String salesTaxState;

    @JacksonXmlProperty(localName = "ShippingIncludedInTax")
    public String shippingIncludedInTax;
}
