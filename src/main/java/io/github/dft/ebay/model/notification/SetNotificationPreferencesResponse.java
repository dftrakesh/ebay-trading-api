package io.github.dft.ebay.model.notification;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement
public class SetNotificationPreferencesResponse {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "Timestamp")
    private String Timestamp;

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "Version")
    private String version;

    @JacksonXmlProperty(localName = "Build")
    private String build;

    @JacksonXmlProperty(localName = "HardExpirationWarning")
    private String hardExpirationWarning;
}
