package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Buyer {

    @JacksonXmlProperty(localName = "BuyerInfo")
    private BuyerInfo buyerInfo;

    @JacksonXmlProperty(localName = "Email")
    private String email;

    @JacksonXmlProperty(localName = "StaticAlias")
    private String staticAlias;

    @JacksonXmlProperty(localName = "UserFirstName")
    private String userFirstName;

    @JacksonXmlProperty(localName = "UserLastName")
    private String userLastName;
}
