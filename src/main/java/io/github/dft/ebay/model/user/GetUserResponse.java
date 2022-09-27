package io.github.dft.ebay.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "GetUserResponse")
public class GetUserResponse implements Serializable {

    @JacksonXmlProperty(localName = "Ack")
    @JsonProperty("Ack")
    private String ack;

    @JacksonXmlProperty(localName = "User")
    @JsonProperty("User")
    private User user;

}
