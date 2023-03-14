package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class SellerDiscount {

    @JacksonXmlProperty(localName = "CampaignDisplayName")
    public String campaignDisplayName;

    @JacksonXmlProperty(localName = "CampaignID")
    public String campaignID;

    @JacksonXmlProperty(localName = "ItemDiscountAmount")
    public String itemDiscountAmount;

    @JacksonXmlProperty(localName = "ShippingDiscountAmount")
    public String shippingDiscountAmount;
}
