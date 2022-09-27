package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JacksonXmlRootElement(localName = "ItemArrayType")
public class ItemArrayType implements Serializable {

    @JacksonXmlProperty(localName = "Item")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<ItemType> item;
}
