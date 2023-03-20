package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class DeliveryDetails {

    @JacksonXmlProperty(localName = "Recipient")
    private Recipient recipient;

    @JacksonXmlProperty(localName = "Sender")
    private Sender sender;
}
