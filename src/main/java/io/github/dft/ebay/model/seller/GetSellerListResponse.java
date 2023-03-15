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
    public boolean hasMoreItems;

    @JacksonXmlProperty(localName = "ItemsPerPage")
    public Integer itemsPerPage;

    @JacksonXmlProperty(localName = "PageNumber")
    public Integer pageNumber;

    @JacksonXmlProperty(localName = "ReturnedItemCountActual")
    public Integer returnedItemCountActual;

    @JacksonXmlProperty(localName = "PaginationResult")
    private PaginationResult paginationResult;

    @JacksonXmlProperty(localName = "ItemArray")
    protected ItemArrayType itemArray;
}
