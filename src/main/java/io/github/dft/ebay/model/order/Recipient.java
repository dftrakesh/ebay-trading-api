package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Recipient {

    @JacksonXmlProperty(localName = "Email")
    public String email;

    @JacksonXmlProperty(localName = "Name")
    public String name;
}
