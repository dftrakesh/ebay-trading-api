package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.seller.PaginationResult;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "GetOrdersResponse")
public class GetOrdersResponse {

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "HasMoreOrders")
    public String hasMoreOrders;

    @JacksonXmlProperty(localName = "PaginationResult")
    private PaginationResult paginationResult;

    @JacksonXmlProperty(localName = "OrderArray")
    protected OrderArray orderArray;
}
