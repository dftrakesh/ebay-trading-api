package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "ItemSpecifics")
public class ItemSpecifics {

    @JacksonXmlProperty(localName = "NameValueList")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<NameValueList> nameValueLists;
}