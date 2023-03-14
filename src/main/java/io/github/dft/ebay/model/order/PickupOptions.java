package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PickupOptions {

    @JacksonXmlProperty(localName = "PickupMethod")
    public String pickupMethod;

    @JacksonXmlProperty(localName = "PickupPriority")
    public String pickupPriority;
}
