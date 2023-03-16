package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ServiceCost {

    @JacksonXmlProperty(localName = "Amount")
    private String amount;

    @JacksonXmlProperty(localName = "ConvertedFromAmount")
    private String convertedFromAmount;
}
