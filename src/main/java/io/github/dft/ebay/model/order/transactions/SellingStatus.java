package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SellingStatus implements Serializable {

    @JacksonXmlProperty(localName = "ConvertedCurrentPrice")
    public Double convertedCurrentPrice;

    @JacksonXmlProperty(localName = "CurrentPrice")
    public Double currentPrice;

    @JacksonXmlProperty(localName = "FinalValueFee")
    public String finalValueFee;

    @JacksonXmlProperty(localName = "ListingStatus")
    public String listingStatus;
}
