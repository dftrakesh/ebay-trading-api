package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class DeliveryDetails {

    @JacksonXmlProperty(localName = "Recipient")
    public Recipient recipient;

    @JacksonXmlProperty(localName = "Sender")
    public Sender sender;
}
