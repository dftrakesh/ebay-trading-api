package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingServiceSelected implements Serializable {

    @JacksonXmlProperty(localName = "ExpeditedService")
    public String expeditedService;

    @JacksonXmlProperty(localName = "ImportCharge")
    public String importCharge;

    @JacksonXmlProperty(localName = "ShippingService")
    public String shippingService;

    @JacksonXmlProperty(localName = "ShippingServiceCost")
    public String shippingServiceCost;

    @JacksonXmlProperty(localName = "ShippingPackageInfo")
    public ShippingPackageInfo shippingPackageInfo;

    @JacksonXmlProperty(localName = "ShippingServiceAdditionalCost")
    public String shippingServiceAdditionalCost;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    public String shippingServicePriority;
}