package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class    Order implements Serializable {

    @JacksonXmlProperty(localName = "OrderID")
    private String orderID;

    @JacksonXmlProperty(localName = "OrderStatus")
    private String orderStatus;

    @JacksonXmlProperty(localName = "CreatedTime")
    private String createdTime;

    @JacksonXmlProperty(localName = "Total")
    private Double total;

    @JacksonXmlProperty(localName = "TransactionArray")
    private TransactionArray transactionArray;

    @JacksonXmlProperty(localName = "ShippingAddress")
    private ShippingAddress shippingAddress;
}
