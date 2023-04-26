package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.transactions.StartPrice;
import lombok.Data;

@Data
public class Variation {

    @JacksonXmlProperty(localName = "SKU")
    private String sku;

    @JacksonXmlProperty(localName = "Quantity")
    private Integer quantity;

    @JacksonXmlProperty(localName = "VariationProductListingDetails")
    private VariationProductListingDetails variationProductListingDetails;

    @JacksonXmlProperty(localName = "StartPrice")
    private StartPrice startPrice;

    @JacksonXmlProperty(localName = "VariationSpecifics")
    private VariationSpecifics variationSpecifics;

    @JacksonXmlProperty(localName = "SellingStatus")
    private SellingStatusType sellingStatus;

    @JacksonXmlProperty(localName = "VariationTitle")
    private String variationTitle;

    private String itemId;
    private Integer positionNo;
    private String createVariant;
    private String updateVariant;
}