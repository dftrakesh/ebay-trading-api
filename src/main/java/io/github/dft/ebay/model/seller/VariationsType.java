package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
@JacksonXmlRootElement(localName = "VariationsType")
public class VariationsType implements Serializable {

    @JacksonXmlProperty(localName = "Variation")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Variation> variation;

    @JacksonXmlProperty(localName = "Pictures")
    private Pictures pictures;

    @JacksonXmlProperty(localName = "VariationSpecificsSet")
    private VariationSpecificsSet variationSpecificsSet;
}