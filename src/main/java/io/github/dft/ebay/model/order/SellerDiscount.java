package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SellerDiscount {

    @JacksonXmlProperty(localName = "CampaignDisplayName")
    private String campaignDisplayName;

    @JacksonXmlProperty(localName = "CampaignID")
    private String campaignID;

    @JacksonXmlProperty(localName = "ItemDiscountAmount")
    private String itemDiscountAmount;

    @JacksonXmlProperty(localName = "ShippingDiscountAmount")
    private String shippingDiscountAmount;
}
