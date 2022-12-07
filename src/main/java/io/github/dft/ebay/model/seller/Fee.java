package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Fee")
public class Fee {

    @JacksonXmlProperty(localName = "Name")
    private String Name;

    @JacksonXmlProperty(localName = "Fee")
    private FeeFee fee;
}