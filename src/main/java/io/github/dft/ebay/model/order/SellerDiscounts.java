package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SellerDiscounts {

    @JacksonXmlProperty(localName = "OriginalItemPrice")
    public String originalItemPrice;

    @JacksonXmlProperty(localName = "OriginalItemShippingCost")
    public String originalItemShippingCost;

    @JacksonXmlProperty(localName = "OriginalShippingService")
    public String originalShippingService;

    @JacksonXmlProperty(localName = "SellerDiscount")
    public SellerDiscount sellerDiscount;
}
