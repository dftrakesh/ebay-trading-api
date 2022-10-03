package io.github.dft.ebay.model.webhook;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class OrderType {

    @JacksonXmlProperty(localName = "OrderID")
    String orderID;
}
