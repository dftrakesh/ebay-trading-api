package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "ShippingDetailsType")
public class ShippingDetailsType {

    @JacksonXmlProperty(localName = "ShippingServiceOptions")
    ShippingServiceOptions shippingServiceOptions;

    @JacksonXmlProperty(localName = "ShippingType")
    private String shippingType;
}