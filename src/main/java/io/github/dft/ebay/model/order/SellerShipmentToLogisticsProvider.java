package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SellerShipmentToLogisticsProvider {

    @JacksonXmlProperty(localName = "ShippingServiceDetails")
    public ShippingServiceDetails shippingServiceDetails;

    @JacksonXmlProperty(localName = "ShippingTimeMax")
    public String ShippingTimeMax;

    @JacksonXmlProperty(localName = "ShippingTimeMin")
    public String ShippingTimeMin;

    @JacksonXmlProperty(localName = "ShipToAddress")
    public ShipToAddress ShipToAddress;
}
