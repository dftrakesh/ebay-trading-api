package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "ShippingServiceOptions")
public class ShippingServiceOptions {

    @JacksonXmlProperty(localName ="ShippingService")
    private String shippingService;

    @JacksonXmlProperty(localName = "ShippingServicePriority")
    private Integer shippingServicePriority;

    @JacksonXmlProperty(localName = "FreeShipping")
    private Boolean freeShipping;
}