package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SellerDiscounts {

    @JacksonXmlProperty(localName = "OriginalItemPrice")
    private String originalItemPrice;

    @JacksonXmlProperty(localName = "OriginalItemShippingCost")
    private String originalItemShippingCost;

    @JacksonXmlProperty(localName = "OriginalShippingService")
    private String originalShippingService;

    @JacksonXmlProperty(localName = "SellerDiscount")
    private SellerDiscount sellerDiscount;
}
