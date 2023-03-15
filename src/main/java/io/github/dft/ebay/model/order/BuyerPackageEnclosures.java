package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BuyerPackageEnclosures {

    @JacksonXmlProperty(localName = "BuyerPackageEnclosure")
    public BuyerPackageEnclosure buyerPackageEnclosure;
}
