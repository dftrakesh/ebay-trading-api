package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingAddress implements Serializable {

    @JacksonXmlProperty(localName = "Name")
    private String name;

    @JacksonXmlProperty(localName = "Street1")
    private String street1;

    @JacksonXmlProperty(localName = "Street2")
    private String street2;

    @JacksonXmlProperty(localName = "CityName")
    private String cityName;

    @JacksonXmlProperty(localName = "StateOrProvince")
    private String stateOrProvince;

    @JacksonXmlProperty(localName = "Country")
    private String country;

    @JacksonXmlProperty(localName = "CountryName")
    private String countryName;

    @JacksonXmlProperty(localName = "Phone")
    private String phone;

    @JacksonXmlProperty(localName = "PostalCode")
    private String postalCode;

    @JacksonXmlProperty(localName = "AddressID")
    private String addressID;

    @JacksonXmlProperty(localName = "AddressOwner")
    private String addressOwner;
}
