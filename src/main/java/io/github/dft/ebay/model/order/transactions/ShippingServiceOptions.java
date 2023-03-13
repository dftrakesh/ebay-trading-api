package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingServiceOptions implements Serializable {

    @JacksonXmlProperty(localName = "ShippingService")
    public String shippingService;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    public Integer shippingServicePriority;

    @JacksonXmlProperty(localName = "ExpeditedService")
    public boolean expeditedService;

    @JacksonXmlProperty(localName = "ShippingTimeMin")
    public Integer shippingTimeMin;

    @JacksonXmlProperty(localName = "ShippingTimeMax")
    public Integer shippingTimeMax;
}
