package io.github.dft.ebay.model.order.transactions;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Seller")
public class Seller implements Serializable {

    @JacksonXmlProperty(localName = "RegistrationDate")
    private String registrationDate;

    @JacksonXmlProperty(localName = "Site")
    private String site;
}
