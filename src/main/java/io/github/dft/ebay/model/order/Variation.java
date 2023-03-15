package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Variation implements Serializable {

    @JacksonXmlProperty(localName = "SKU")
    private String sku;

    @JacksonXmlProperty(localName = "VariationTitle")
    private String variationTitle;

    @JacksonXmlProperty(localName = "VariationViewItemURL")
    private String variationViewItemURL;
}
