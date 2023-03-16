package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingServiceSelected implements Serializable {

    @JacksonXmlProperty(localName = "ExpeditedService")
    private String expeditedService;

    @JacksonXmlProperty(localName = "ImportCharge")
    private String importCharge;

    @JacksonXmlProperty(localName = "ShippingService")
    private String shippingService;

    @JacksonXmlProperty(localName = "ShippingServiceCost")
    private String shippingServiceCost;

    @JacksonXmlProperty(localName = "ShippingPackageInfo")
    private ShippingPackageInfo shippingPackageInfo;

    @JacksonXmlProperty(localName = "ShippingServiceAdditionalCost")
    private String shippingServiceAdditionalCost;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    private String shippingServicePriority;
}