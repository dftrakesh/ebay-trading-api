package io.github.dft.ebay.model.order.transactions.itemtransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ShippingServiceOptions {

    @JacksonXmlProperty(localName = "ShippingService")
    private String shippingService;

    @JacksonXmlProperty(localName = "ImportCharge")
    private String importCharge;

    @JacksonXmlProperty(localName = "ShippingPackageInfo")
    private ShippingPackageInfo shippingPackageInfo;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    private Integer shippingServicePriority;

    @JacksonXmlProperty(localName = "ExpeditedService")
    private Boolean expeditedService;

    @JacksonXmlProperty(localName = "ShippingTimeMin")
    private Integer shippingTimeMin;

    @JacksonXmlProperty(localName = "ShippingTimeMax")
    private Integer shippingTimeMax;
}