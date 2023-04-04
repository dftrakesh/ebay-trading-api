package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "SellingStatusType")
public class SellingStatusType implements Serializable {

    @JacksonXmlProperty(localName = "CurrentPrice")
    private Double currentPrice;

    @JacksonXmlProperty(localName = "QuantitySold")
    private Integer quantitySold;

    @JacksonXmlProperty(localName = "ConvertedCurrentPrice")
    private Double convertedCurrentPrice;

    @JacksonXmlProperty(localName = "ListingStatus")
    private String listingStatus;
}
