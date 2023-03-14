package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ServiceCost {

    @JacksonXmlProperty(localName = "Amount")
    public String amount;

    @JacksonXmlProperty(localName = "ConvertedFromAmount")
    public String convertedFromAmount;
}
