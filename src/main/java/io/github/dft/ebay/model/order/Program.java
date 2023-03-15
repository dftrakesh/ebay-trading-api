package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Program {

    @JacksonXmlProperty(localName = "AuthenticityVerification")
    public AuthenticityVerification authenticityVerification;

    @JacksonXmlProperty(localName = "Fulfillment")
    public Fulfillment fulfillment;
}
