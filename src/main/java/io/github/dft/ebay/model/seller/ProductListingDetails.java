package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductListingDetails {

    @JacksonXmlProperty(localName = "BrandMPN")
    private BrandMPN brandMPN;

    @JacksonXmlProperty(localName = "IncludeeBayProductDetails")
    private Boolean includeeBayProductDetails;
}