package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JacksonXmlRootElement(localName = "Item")
public class ItemType implements Serializable {

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

    @JacksonXmlProperty(localName = "SellingStatus")
    private SellingStatusType sellingStatus;

    @JacksonXmlProperty(localName = "ConditionDisplayName")
    private String conditionDisplayName;

    @JacksonXmlProperty(localName = "ListingDetails")
    private ListingDetailsType listingDetails;

    @JacksonXmlProperty(localName = "Variations")
    private VariationsType variations;

    @JacksonXmlProperty(localName = "PictureDetails")
    private PictureDetailsType pictureDetails;

    @JacksonXmlProperty(localName = "DispatchTimeMax")
    private String dispatchTimeMax;

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
}