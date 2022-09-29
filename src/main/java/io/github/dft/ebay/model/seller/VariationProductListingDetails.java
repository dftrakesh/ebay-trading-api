package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class VariationProductListingDetails {

    @JacksonXmlProperty(localName = "EAN")
    private String ean;

    @JacksonXmlProperty(localName = "ISBN")
    private String isbn;

    @JacksonXmlProperty(localName = "UPC")
    private String upc;
}
