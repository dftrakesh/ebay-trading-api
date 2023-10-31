package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "ShippingDetailsType")
public class ShippingDetailsType {

    @JacksonXmlProperty(localName = "ShippingServiceOptions")
    ShippingServiceOptions shippingServiceOptions;

    @JacksonXmlProperty(localName = "ShippingType")
    private String shippingType;
}