package io.github.dft.ebay.model.order.transactions.itemtransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingPackageInfo implements Serializable {

    @JacksonXmlProperty(localName = "ActualDeliveryTime")
    private String actualDeliveryTime;

    @JacksonXmlProperty(localName = "EstimatedDeliveryTimeMin")
    private String estimatedDeliveryTimeMin;

    @JacksonXmlProperty(localName = "EstimatedDeliveryTimeMax")
    private String estimatedDeliveryTimeMax;

    @JacksonXmlProperty(localName = "HandleByTime")
    private String handleByTime;

    @JacksonXmlProperty(localName = "MaxNativeEstimatedDeliveryTime")
    private String maxNativeEstimatedDeliveryTime;

    @JacksonXmlProperty(localName = "MinNativeEstimatedDeliveryTime")
    private String minNativeEstimatedDeliveryTime;

    @JacksonXmlProperty(localName = "ScheduledDeliveryTimeMax")
    private String scheduledDeliveryTimeMax;

    @JacksonXmlProperty(localName = "ScheduledDeliveryTimeMin")
    private String scheduledDeliveryTimeMin;

    @JacksonXmlProperty(localName = "ShippingTrackingEvent")
    private String shippingTrackingEvent;

    @JacksonXmlProperty(localName = "StoreID")
    private String storeID;
}
