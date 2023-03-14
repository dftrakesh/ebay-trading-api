package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class InternationalShippingServiceOption {

    @JacksonXmlProperty(localName = "ImportCharge")
    public String importCharge;

    @JacksonXmlProperty(localName = "ShippingService")
    public String shippingService;

    @JacksonXmlProperty(localName = "ShippingServiceAdditionalCost")
    public String shippingServiceAdditionalCost;

    @JacksonXmlProperty(localName = "ShippingServiceCost")
    public String shippingServiceCost;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    public String shippingServicePriority;

    @JacksonXmlProperty(localName = "ShipToLocation")
    public String shipToLocation;
}
