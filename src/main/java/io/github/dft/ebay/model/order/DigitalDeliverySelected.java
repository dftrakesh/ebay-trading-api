package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class DigitalDeliverySelected {

    @JacksonXmlProperty(localName = "DeliveryDetails")
    private DeliveryDetails deliveryDetails;

    @JacksonXmlProperty(localName = "DeliveryMethod")
    private String deliveryMethod;

    @JacksonXmlProperty(localName = "DeliveryStatus")
    private String deliveryStatus;
}
