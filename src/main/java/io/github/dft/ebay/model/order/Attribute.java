package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class Attribute {

    @JacksonXmlProperty(localName = "name")
    private String name;

    @JacksonXmlText
    private String text;
}
