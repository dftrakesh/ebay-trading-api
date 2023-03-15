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

    @JacksonXmlProperty(localName = "Currency")
    public String currency;

    @JacksonXmlProperty(localName = "InventoryTrackingMethod")
    public String inventoryTrackingMethod;

    @JacksonXmlProperty(localName = "ListingDetails")
    public ListingDetails listingDetails;
;
    @JacksonXmlProperty(localName = "LotSize")
    public String lotSize;

    @JacksonXmlProperty(localName = "PaymentMethods")
    public String paymentMethods;

    @JacksonXmlProperty(localName = "Quantity")
    public String quantity;

    @JacksonXmlProperty(localName = "Seller")
    public Seller seller;

    @JacksonXmlProperty(localName = "Site")
    public String site;

    @JacksonXmlProperty(localName = "StartPrice")
    public String startPrice;

    @JacksonXmlProperty(localName = "Variations")
    public Variations variations;
}
