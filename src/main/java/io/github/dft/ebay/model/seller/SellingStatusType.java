package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "SellingStatusType")
public class SellingStatusType {

    @JacksonXmlProperty(localName = "CurrentPrice")
    private Double currentPrice;

    @JacksonXmlProperty(localName = "QuantitySold")
    private Integer quantitySold;

    @JacksonXmlProperty(localName = "ConvertedCurrentPrice")
    private Double convertedCurrentPrice;

    @JacksonXmlProperty(localName = "ListingStatus")
    private String listingStatus;
}
