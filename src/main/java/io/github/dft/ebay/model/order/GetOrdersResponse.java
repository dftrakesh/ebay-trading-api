package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.seller.PaginationResult;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "GetOrdersResponse")
public class GetOrdersResponse {

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "HasMoreOrders")
    private Boolean hasMoreOrders;

    @JacksonXmlProperty(localName = "OrdersPerPage")
    private Integer orderPerPage;

    @JacksonXmlProperty(localName = "PageNumber")
    private Integer pageNumber;

    @JacksonXmlProperty(localName = "ReturnedOrderCountActual")
    private Integer returnedOrderCountActual;

    @JacksonXmlProperty(localName = "PaginationResult")
    private PaginationResult paginationResult;

    @JacksonXmlProperty(localName = "OrderArray")
    private OrderArray orderArray;
}