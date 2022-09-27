package io.github.dft.ebay.model.token;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EbayToken {
    @JacksonXmlProperty(localName = "eBayAuthToken")
    private String eBayAuthToken;
}
