package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class PickupDetails {

    @JacksonXmlProperty(localName = "PickupOptions")
    private PickupOptions pickupOptions;
}
