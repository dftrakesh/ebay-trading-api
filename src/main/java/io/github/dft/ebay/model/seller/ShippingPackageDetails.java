package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "ShippingPackageDetails")
public class ShippingPackageDetails {

    @JacksonXmlProperty(localName = "PackageDepth")
    public PackageDepth packageDepth;

    @JacksonXmlProperty(localName = "PackageLength")
    public PackageLength packageLength;

    @JacksonXmlProperty(localName = "PackageWidth")
    public PackageWidth packageWidth;

    @JacksonXmlProperty(localName = "ShippingIrregular")
    public boolean ShippingIrregular;

    @JacksonXmlProperty(localName = "ShippingPackage")
    public String ShippingPackage;

    @JacksonXmlProperty(localName = "WeightMajor")
    public WeightMajor weightMajor;

    @JacksonXmlProperty(localName = "WeightMinor")
    public WeightMinor weightMinor;
}
