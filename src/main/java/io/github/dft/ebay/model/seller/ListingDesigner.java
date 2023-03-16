package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ListingDesigner {

    @JacksonXmlProperty(localName = "LayoutID")
    private String layoutID;

    @JacksonXmlProperty(localName = "ThemeID")
    private String themeID;
}
