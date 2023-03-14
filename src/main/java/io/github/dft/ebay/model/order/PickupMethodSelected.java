package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PickupMethodSelected {

    @JacksonXmlProperty(localName = "MerchantPickupCode")
    public String merchantPickupCode;

    @JacksonXmlProperty(localName = "PickupFulfillmentTime")
    public String pickupFulfillmentTime;

    @JacksonXmlProperty(localName = "PickupLocationUUID")
    public String pickupLocationUUID;

    @JacksonXmlProperty(localName = "PickupMethod")
    public String pickupMethod;

    @JacksonXmlProperty(localName = "PickupStatus")
    public String pickupStatus;

    @JacksonXmlProperty(localName = "PickupStoreID")
    public String pickupStoreID;
}
