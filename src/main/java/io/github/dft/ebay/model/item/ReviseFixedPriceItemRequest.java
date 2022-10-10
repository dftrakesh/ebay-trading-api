package io.github.dft.ebay.model.item;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.seller.ItemType;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReviseFixedPriceItemRequest {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken RequesterCredentials;

    @JacksonXmlProperty(localName = "Item")
    protected ItemType itemType;
}
