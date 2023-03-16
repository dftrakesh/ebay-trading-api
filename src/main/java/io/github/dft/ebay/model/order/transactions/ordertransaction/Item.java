package io.github.dft.ebay.model.order.transactions.ordertransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.transactions.SellingStatus;
import lombok.Data;

@Data
public class Item {

    @JacksonXmlProperty(localName = "ItemID")
    private String itemID;

    @JacksonXmlProperty(localName = "ApplicationData")
    private String applicationData;

    @JacksonXmlProperty(localName = "AutoPay")
    private String autoPay;

    @JacksonXmlProperty(localName = "BuyerProtection")
    private String buyerProtection;

    @JacksonXmlProperty(localName = "BuyItNowPrice")
    private String buyItNowPrice;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    private String integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "ListingType")
    private String listingType;

    @JacksonXmlProperty(localName = "PrivateListing")
    private String privateListing;

    @JacksonXmlProperty(localName = "SellingStatus")
    private SellingStatus sellingStatus;
}

