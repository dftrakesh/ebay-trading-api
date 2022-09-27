package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "PaginationResult")
public class PaginationResult implements Serializable {

    @JacksonXmlProperty(localName = "TotalNumberOfPages")
    private Integer totalNumberOfPages;

    @JacksonXmlProperty(localName = "TotalNumberOfEntries")
    private Integer totalNumberOfEntries;
}
