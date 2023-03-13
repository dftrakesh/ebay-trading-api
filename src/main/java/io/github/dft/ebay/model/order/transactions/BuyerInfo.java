package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.ShippingAddress;
import lombok.Data;

import java.io.Serializable;

@Data
public class BuyerInfo implements Serializable {


    @JacksonXmlProperty(localName = "ShippingAddress")
    public ShippingAddress shippingAddress;
}