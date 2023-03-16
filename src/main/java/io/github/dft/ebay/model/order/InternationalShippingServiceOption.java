package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class InternationalShippingServiceOption {

    @JacksonXmlProperty(localName = "ImportCharge")
    private String importCharge;

    @JacksonXmlProperty(localName = "ShippingService")
    private String shippingService;

    @JacksonXmlProperty(localName = "ShippingServiceAdditionalCost")
    private String shippingServiceAdditionalCost;

    @JacksonXmlProperty(localName = "ShippingServiceCost")
    private String shippingServiceCost;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    private String shippingServicePriority;

    @JacksonXmlProperty(localName = "ShipToLocation")
    private String shipToLocation;
}
