package io.github.dft.ebay.model.notification;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ApplicationDeliveryPreferences {

    @JacksonXmlProperty(localName = "ApplicationEnable")
    private String applicationEnable;

    @JacksonXmlProperty(localName = "ApplicationURL")
    private String applicationURL;

    @JacksonXmlProperty(localName = "DeviceType")
    private String deviceType;

}
