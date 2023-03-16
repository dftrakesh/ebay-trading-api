package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SellingStatus implements Serializable {

    @JacksonXmlProperty(localName = "ConvertedCurrentPrice")
    private Double convertedCurrentPrice;

    @JacksonXmlProperty(localName = "CurrentPrice")
    private Double currentPrice;

    @JacksonXmlProperty(localName = "FinalValueFee")
    private String finalValueFee;

    @JacksonXmlProperty(localName = "ListingStatus")
    private String listingStatus;
}
