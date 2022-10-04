package io.github.dft.ebay.model.notification;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement
public class SetNotificationPreferencesRequest {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken RequesterCredentials;

    @JacksonXmlProperty(localName = "ApplicationDeliveryPreferences")
    private ApplicationDeliveryPreferences applicationDeliveryPreferences;

    @JacksonXmlProperty(localName = "NotificationEnable")
    @JacksonXmlElementWrapper(localName = "UserDeliveryPreferenceArray")
    private List<NotificationEnable> userDeliveryPreferenceArray;
}
