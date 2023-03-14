package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingPackageInfo implements Serializable {

    @JacksonXmlProperty(localName = "ActualDeliveryTime")
    public String actualDeliveryTime;

    @JacksonXmlProperty(localName = "ScheduledDeliveryTimeMax")
    public String scheduledDeliveryTimeMax;

    @JacksonXmlProperty(localName = "ScheduledDeliveryTimeMin")
    public String scheduledDeliveryTimeMin;

    @JacksonXmlProperty(localName = "ShippingTrackingEvent")
    public String shippingTrackingEvent;

    @JacksonXmlProperty(localName = "StoreID")
    public String storeID;
}
