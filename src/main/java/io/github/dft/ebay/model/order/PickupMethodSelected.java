package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PickupMethodSelected {

    @JacksonXmlProperty(localName = "MerchantPickupCode")
    private String merchantPickupCode;

    @JacksonXmlProperty(localName = "PickupFulfillmentTime")
    private String pickupFulfillmentTime;

    @JacksonXmlProperty(localName = "PickupLocationUUID")
    private String pickupLocationUUID;

    @JacksonXmlProperty(localName = "PickupMethod")
    private String pickupMethod;

    @JacksonXmlProperty(localName = "PickupStatus")
    private String pickupStatus;

    @JacksonXmlProperty(localName = "PickupStoreID")
    private String pickupStoreID;
}
