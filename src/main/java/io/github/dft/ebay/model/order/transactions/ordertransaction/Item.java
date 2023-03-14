package io.github.dft.ebay.model.order.transactions.ordertransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.transactions.SellingStatus;
import lombok.Data;

@Data
public class Item {

    @JacksonXmlProperty(localName = "ItemID")
    private String itemID;

    @JacksonXmlProperty(localName = "ApplicationData")
    public String applicationData;

    @JacksonXmlProperty(localName = "AutoPay")
    public String autoPay;

    @JacksonXmlProperty(localName = "BuyerProtection")
    public String buyerProtection;

    @JacksonXmlProperty(localName = "BuyItNowPrice")
    public String buyItNowPrice;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    public String integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "ListingType")
    public String listingType;

    @JacksonXmlProperty(localName = "PrivateListing")
    public String privateListing;

    @JacksonXmlProperty(localName = "SellingStatus")
    public SellingStatus sellingStatus;
}
