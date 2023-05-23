package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CalculatedShippingRate {

    @JacksonXmlProperty(localName = "OriginatingPostalCode")
    private Integer originatingPostalCode;

    @JacksonXmlProperty(localName = "PackageDepth")
    private PackageDepth packageDepth;

    @JacksonXmlProperty(localName = "PackageLength")
    private PackageLength packageLength;

    @JacksonXmlProperty(localName = "PackageWidth")
    private PackageWidth packageWidth;

    @JacksonXmlProperty(localName = "PackagingHandlingCosts")
    private PackagingHandlingCosts packagingHandlingCosts;

    @JacksonXmlProperty(localName = "ShippingIrregular")
    private Boolean shippingIrregular;

    @JacksonXmlProperty(localName = "ShippingPackage")
    private String shippingPackage;

    @JacksonXmlProperty(localName = "WeightMajor")
    private WeightMajor weightMajor;

    @JacksonXmlProperty(localName = "WeightMinor")
    private WeightMinor weightMinor;
}