package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Program {

    @JacksonXmlProperty(localName = "AuthenticityVerification")
    private AuthenticityVerification authenticityVerification;

    @JacksonXmlProperty(localName = "Fulfillment")
    private Fulfillment fulfillment;
}
