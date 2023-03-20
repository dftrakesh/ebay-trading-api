package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BuyerTaxIdentifier {

    @JacksonXmlProperty(localName = "Attribute")
    private Attribute attribute;

    @JacksonXmlProperty(localName = "ID")
    private String id;

    @JacksonXmlProperty(localName = "Type")
    private String type;
}
