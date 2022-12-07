package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "VariationSpecificPictureSet")
public class VariationSpecificPictureSet {

    @JacksonXmlProperty(localName = "VariationSpecificValue")
    private String variationSpecificValue;

    @JacksonXmlProperty(localName = "PictureURL")
    private String pictureURL;
}