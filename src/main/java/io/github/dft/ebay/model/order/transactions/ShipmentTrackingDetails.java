package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShipmentTrackingDetails implements Serializable {

    @JacksonXmlProperty(localName = "ShippingCarrierUsed")
    public String shippingCarrierUsed;

    @JacksonXmlProperty(localName = "ShipmentTrackingNumber")
    public String shipmentTrackingNumber;
}
