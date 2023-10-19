package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingServiceOptions implements Serializable {

    @JacksonXmlProperty(localName = "ShippingService")
    private String shippingService;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    private String shippingServicePriority;

    @JacksonXmlProperty(localName = "ExpeditedService")
    private String expeditedService;

    @JacksonXmlProperty(localName = "ImportCharge")
    private String importCharge;

    @JacksonXmlProperty(localName = "ShippingPackageInfo")
    private ShippingPackageInfo shippingPackageInfo;

    @JacksonXmlProperty(localName = "ShippingServiceAdditionalCost")
    private String shippingServiceAdditionalCost;

    @JacksonXmlProperty(localName = "ShippingServiceCost")
    private String shippingServiceCost;
}
