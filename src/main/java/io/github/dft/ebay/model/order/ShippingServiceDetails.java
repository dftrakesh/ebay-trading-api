package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ShippingServiceDetails {

    @JacksonXmlProperty(localName = "ShippingService")
    public String ShippingService;

    @JacksonXmlProperty(localName = "TotalShippingCost")
    public String TotalShippingCost;
}
