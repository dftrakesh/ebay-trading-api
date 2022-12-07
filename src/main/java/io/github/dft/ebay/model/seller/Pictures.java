package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import java.util.List;

@Data
@JacksonXmlRootElement(localName = "Pictures")
public class Pictures {

    @JacksonXmlProperty(localName = "VariationSpecificName")
    private String variationSpecificName;

    @JacksonXmlProperty(localName = "VariationSpecificPictureSet")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<VariationSpecificPictureSet> variationSpecificPictureSet;
}