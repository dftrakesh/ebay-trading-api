package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingPackageInfo implements Serializable {

    @JacksonXmlProperty(localName = "ActualDeliveryTime")
    public String actualDeliveryTime;

    @JacksonXmlProperty(localName = "EstimatedDeliveryTimeMin")
    public String estimatedDeliveryTimeMin;

    @JacksonXmlProperty(localName = "EstimatedDeliveryTimeMax")
    public String estimatedDeliveryTimeMax;
}
