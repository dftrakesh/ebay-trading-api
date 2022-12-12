package io.github.dft.ebay.model.item;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.seller.ErrorType;
import lombok.Data;
import java.util.List;

@Data
@JacksonXmlRootElement(localName = "AddFixedPriceItemResponse")
public class AddFixedPriceItemResponse {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "Timestamp")
    private String timestamp;

    @JacksonXmlProperty(localName = "Version")
    private int version;

    @JacksonXmlProperty(localName = "Build")
    private String build;

    @JacksonXmlProperty(localName = "ItemID")
    private String itemID;

    @JacksonXmlProperty(localName = "Fees")
    private io.github.dft.ebay.model.seller.Fees Fees;

    @JacksonXmlProperty(localName = "DiscountReason")
    private String DiscountReason;

    @JacksonXmlProperty(localName = "Errors")
    private ErrorType errors;
}