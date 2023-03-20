package io.github.dft.ebay.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "User")
public class User {

    @JacksonXmlProperty(localName = "RegistrationDate")
    private String registrationDate;
}
