package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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

}
