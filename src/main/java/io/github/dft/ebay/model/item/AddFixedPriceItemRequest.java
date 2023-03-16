package io.github.dft.ebay.model.item;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.seller.ItemType;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "AddFixedPriceItemRequest")
public class AddFixedPriceItemRequest {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken RequesterCredentials;

    @JacksonXmlProperty(localName = "Item")
    private ItemType itemType;
}