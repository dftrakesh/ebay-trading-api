package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Pictures")
public class Pictures {

    @JacksonXmlProperty(localName = "VariationSpecificName")
    private String variationSpecificName;

    @JacksonXmlProperty(localName = "VariationSpecificPictureSet")
    private VariationSpecificPictureSet variationSpecificPictureSet;
}