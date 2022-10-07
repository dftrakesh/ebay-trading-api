package io.github.dft.ebay.model.item;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "ReviseFixedPriceItemResponse")
public class ReviseFixedPriceItemResponse {

    @JacksonXmlProperty(localName = "Ack")
    private String ack;
}
