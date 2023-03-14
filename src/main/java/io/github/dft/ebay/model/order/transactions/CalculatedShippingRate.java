package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CalculatedShippingRate {

    @JacksonXmlProperty(localName = "OriginatingPostalCode")
    public Integer originatingPostalCode;

    @JacksonXmlProperty(localName = "PackageDepth")
    public PackageDepth packageDepth;

    @JacksonXmlProperty(localName = "PackageLength")
    public PackageLength packageLength;

    @JacksonXmlProperty(localName = "PackageWidth")
    public PackageWidth packageWidth;

    @JacksonXmlProperty(localName = "PackagingHandlingCosts")
    public PackagingHandlingCosts packagingHandlingCosts;

    @JacksonXmlProperty(localName = "ShippingIrregular")
    public boolean shippingIrregular;

    @JacksonXmlProperty(localName = "ShippingPackage")
    public String shippingPackage;

    @JacksonXmlProperty(localName = "WeightMajor")
    public WeightMajor weightMajor;

    @JacksonXmlProperty(localName = "WeightMinor")
    public WeightMinor weightMinor;
}
