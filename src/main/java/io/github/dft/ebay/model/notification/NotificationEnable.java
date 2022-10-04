package io.github.dft.ebay.model.notification;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class NotificationEnable {

    @JacksonXmlProperty(localName = "EventEnable")
    private String eventEnable;

    @JacksonXmlProperty(localName = "EventType")
    private String eventType;
}
