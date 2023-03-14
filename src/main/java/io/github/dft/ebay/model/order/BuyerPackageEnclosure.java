package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class BuyerPackageEnclosure {

    @JacksonXmlProperty(localName = "type")
    public String type;

    @JacksonXmlText
    public String text;
}
