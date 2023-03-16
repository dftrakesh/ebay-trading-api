package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class TaxJurisdiction {

    @JacksonXmlProperty(localName = "JurisdictionID")
    private String jurisdictionID;

    @JacksonXmlProperty(localName = "SalesTaxPercent")
    private Double salesTaxPercent;

    @JacksonXmlProperty(localName = "ShippingIncludedInTax")
    private boolean shippingIncludedInTax;
}
