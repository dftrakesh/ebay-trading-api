package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class BrandMPN {

    @JacksonXmlProperty(localName = "Brand")
    private String brand;

    @JacksonXmlProperty(localName = "MPN")
    private String mpn;
}
