package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrderIDArray implements Serializable{

    @JacksonXmlProperty(localName = "OrderID")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> orderID;
}

