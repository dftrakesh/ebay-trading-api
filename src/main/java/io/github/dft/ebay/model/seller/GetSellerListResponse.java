package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "GetSellerListResponse")
public class GetSellerListResponse implements Serializable {

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "HasMoreItems")
    private Boolean hasMoreItems;

    @JacksonXmlProperty(localName = "ItemsPerPage")
    private Integer itemsPerPage;

    @JacksonXmlProperty(localName = "PageNumber")
    private Integer pageNumber;

    @JacksonXmlProperty(localName = "ReturnedItemCountActual")
    private Integer returnedItemCountActual;

    @JacksonXmlProperty(localName = "PaginationResult")
    private PaginationResult paginationResult;

    @JacksonXmlProperty(localName = "ItemArray")
    private ItemArrayType itemArray;
}