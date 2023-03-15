package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Buyer {

    @JacksonXmlProperty(localName = "BuyerInfo")
    public BuyerInfo buyerInfo;

    @JacksonXmlProperty(localName = "Email")
    public String email;

    @JacksonXmlProperty(localName = "StaticAlias")
    public String staticAlias;

    @JacksonXmlProperty(localName = "UserFirstName")
    public String userFirstName;

    @JacksonXmlProperty(localName = "UserLastName")
    public String userLastName;
}
