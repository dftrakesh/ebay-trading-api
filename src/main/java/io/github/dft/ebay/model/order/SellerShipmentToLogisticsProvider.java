package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SellerShipmentToLogisticsProvider {

    @JacksonXmlProperty(localName = "ShippingServiceDetails")
    private ShippingServiceDetails shippingServiceDetails;

    @JacksonXmlProperty(localName = "ShippingTimeMax")
    private String ShippingTimeMax;

    @JacksonXmlProperty(localName = "ShippingTimeMin")
    private String ShippingTimeMin;

    @JacksonXmlProperty(localName = "ShipToAddress")
    private ShipToAddress ShipToAddress;
}
