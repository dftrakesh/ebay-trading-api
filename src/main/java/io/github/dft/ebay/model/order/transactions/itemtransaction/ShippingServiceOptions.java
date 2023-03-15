package io.github.dft.ebay.model.order.transactions.itemtransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ShippingServiceOptions {

    @JacksonXmlProperty(localName = "ShippingService")
    public String shippingService;

    @JacksonXmlProperty(localName = "ImportCharge")
    public String importCharge;

    @JacksonXmlProperty(localName = "ShippingPackageInfo")
    public ShippingPackageInfo shippingPackageInfo;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    public Integer shippingServicePriority;

    @JacksonXmlProperty(localName = "ExpeditedService")
    public boolean expeditedService;

    @JacksonXmlProperty(localName = "ShippingTimeMin")
    public Integer shippingTimeMin;

    @JacksonXmlProperty(localName = "ShippingTimeMax")
    public Integer shippingTimeMax;
}
