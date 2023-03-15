package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "PrimaryCategory")
public class PrimaryCategory {

    @JacksonXmlProperty(localName = "CategoryID")
    private String categoryID;

    @JacksonXmlProperty(localName = "CategoryName")
    private String categoryName;
}