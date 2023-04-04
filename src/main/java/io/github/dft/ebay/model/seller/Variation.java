package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
public class Variation implements Serializable {

    @JacksonXmlProperty(localName = "SKU")
    private String sku;

    @JacksonXmlProperty(localName = "Quantity")
    private Integer quantity;

    @JacksonXmlProperty(localName = "VariationProductListingDetails")
    private VariationProductListingDetails variationProductListingDetails;

    @JacksonXmlProperty(localName = "StartPrice")
    private Double startPrice;

    @JacksonXmlProperty(localName = "VariationSpecifics")
    private VariationSpecifics variationSpecifics;

    @JacksonXmlProperty(localName = "SellingStatus")
    private SellingStatusType sellingStatus;

    @JacksonXmlProperty(localName = "VariationTitle")
    private String variationTitle;

    private String itemId;
}