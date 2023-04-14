package io.github.dft.ebay.model.order.transactions.itemtransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.transactions.ListingDetails;
import io.github.dft.ebay.model.order.transactions.Seller;
import io.github.dft.ebay.model.order.transactions.SellingStatus;
import lombok.Data;

@Data
public class Item {

    @JacksonXmlProperty(localName = "ItemID")
    private String itemID;

    @JacksonXmlProperty(localName = "Title")
    private String title;

    @JacksonXmlProperty(localName = "SKU")
    private String sku;

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

    @JacksonXmlProperty(localName = "Currency")
    private String currency;

    @JacksonXmlProperty(localName = "InventoryTrackingMethod")
    private String inventoryTrackingMethod;

    @JacksonXmlProperty(localName = "ListingDetails")
    private ListingDetails listingDetails;
;
    @JacksonXmlProperty(localName = "LotSize")
    private String lotSize;

    @JacksonXmlProperty(localName = "PaymentMethods")
    private String paymentMethods;

    @JacksonXmlProperty(localName = "Quantity")
    private String quantity;

    @JacksonXmlProperty(localName = "Seller")
    private Seller seller;

    @JacksonXmlProperty(localName = "Site")
    private String site;

    @JacksonXmlProperty(localName = "StartPrice")
    private Double startPrice;

    @JacksonXmlProperty(localName = "Variations")
    private Variations variations;
}
