package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class DigitalDeliverySelected {

    @JacksonXmlProperty(localName = "DeliveryDetails")
    public DeliveryDetails deliveryDetails;

    @JacksonXmlProperty(localName = "DeliveryMethod")
    public String deliveryMethod;

    @JacksonXmlProperty(localName = "DeliveryStatus")
    public String deliveryStatus;
}
