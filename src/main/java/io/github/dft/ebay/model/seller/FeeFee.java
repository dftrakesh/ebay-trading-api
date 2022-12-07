package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Fee")
public class FeeFee {

    @JacksonXmlProperty(isAttribute = true, localName = "currencyID")
    private String currencyID;
}