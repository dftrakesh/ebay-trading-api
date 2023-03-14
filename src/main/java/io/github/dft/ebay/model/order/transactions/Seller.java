package io.github.dft.ebay.model.order.transactions;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "Seller")
public class Seller implements Serializable {

    @JacksonXmlProperty(localName = "RegistrationDate")
    public String registrationDate;

    @JacksonXmlProperty(localName = "Site")
    public String site;
}