package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BuyerTaxIdentifier {

    @JacksonXmlProperty(localName = "Attribute")
    public Attribute attribute;

    @JacksonXmlProperty(localName = "ID")
    public String id;

    @JacksonXmlProperty(localName = "Type")
    public String type;
}
