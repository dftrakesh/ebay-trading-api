package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.order.transactions.ListingDetails;
import io.github.dft.ebay.model.order.transactions.StartPrice;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Item")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemType {

    @JacksonXmlProperty(localName = "ItemID")
    private String itemID;

    @JacksonXmlProperty(localName = "SKU")
    private String sku;

    @JacksonXmlProperty(localName = "Title")
    private String title;

    @JacksonXmlProperty(localName = "SubTitle")
    private String subTitle;

    @JacksonXmlProperty(localName = "Quantity")
    private Integer quantity;

    @JacksonXmlProperty(localName = "QuantityAvailable")
    private Integer quantityAvailable;

    @JacksonXmlProperty(localName = "QuantityAvailableHint")
    private String quantityAvailableHint;

    @JacksonXmlProperty(localName = "SellingStatus")
    private SellingStatusType sellingStatus;

    @JacksonXmlProperty(localName = "ConditionDisplayName")
    private String conditionDisplayName;

    @JacksonXmlProperty(localName = "ListingDetails")
    private ListingDetails listingDetails;

    @JacksonXmlProperty(localName = "Variations")
    private VariationsType variations;

    @JacksonXmlProperty(localName = "PictureDetails")
    private PictureDetailsType pictureDetails;

    @JacksonXmlProperty(localName = "DispatchTimeMax")
    private Integer dispatchTimeMax;

    @JacksonXmlProperty(localName = "ItemSpecifics")
    private ItemSpecifics itemSpecifics;

    @JacksonXmlProperty(localName = "ShippingDetails")
    private ShippingDetailsType shippingDetails;

    @JacksonXmlProperty(localName = "Site")
    private String site;

    @JacksonXmlProperty(localName = "Country")
    private String country;

    @JacksonXmlProperty(localName = "Currency")
    private String currency;

    @JacksonXmlProperty(localName = "Description")
    private String description;

    @JacksonXmlProperty(localName = "ListingDuration")
    private String listingDuration;

    @JacksonXmlProperty(localName = "ListingType")
    private String listingType;

    @JacksonXmlProperty(localName = "PostalCode")
    private String postalCode;

    @JacksonXmlProperty(localName = "ConditionID")
    private String conditionID;

    @JacksonXmlProperty(localName = "ReturnPolicy")
    private ReturnPolicyType returnPolicy;

    @JacksonXmlProperty(localName = "PrimaryCategory")
    private PrimaryCategory primaryCategory;

    @JacksonXmlProperty(localName = "StartPrice")
    private StartPrice startPrice;

    @JacksonXmlProperty(localName = "WatchCount")
    private Integer watchCount;

    @JacksonXmlProperty(localName = "Location")
    private String location;

    @JacksonXmlProperty(localName = "ListingDesigner")
    private ListingDesigner listingDesigner;

    @JacksonXmlProperty(localName = "ProductListingDetails")
    private ProductListingDetails productListingDetails;

    @JacksonXmlProperty(localName = "ShippingPackageDetails")
    private ShippingPackageDetails shippingPackageDetails;

    @JacksonXmlProperty(localName = "HitCounter")
    private String hitCounter;

    @JacksonXmlProperty(localName = "OutOfStockControl")
    private Boolean outOfStockControl;

    @JacksonXmlProperty(localName = "TimeLeft")
    private String timeLeft;

    @JacksonXmlProperty(localName = "UUID")
    private String uuid;
}