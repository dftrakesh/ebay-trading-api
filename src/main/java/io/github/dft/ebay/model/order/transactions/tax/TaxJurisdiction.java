package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class TaxJurisdiction {

    @JacksonXmlProperty(localName = "JurisdictionID")
    public String jurisdictionID;

    @JacksonXmlProperty(localName = "SalesTaxPercent")
    public Double salesTaxPercent;

    @JacksonXmlProperty(localName = "ShippingIncludedInTax")
    public boolean shippingIncludedInTax;
}
