package io.github.dft.ebay.model.item;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.DetailLevelCodeType;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetItemRequest {
    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "ItemID")
    private String itemID;

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken requesterCredentials;
    
    @JacksonXmlProperty(localName = "IncludeItemSpecifics")
    private Boolean includeItemSpecifics;

    @JacksonXmlProperty(localName = "DetailLevel")
    private DetailLevelCodeType detailLevel;

    public GetItemRequest(String itemID) {
        this.itemID = itemID;
    }
}
