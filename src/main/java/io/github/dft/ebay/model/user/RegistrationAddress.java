package io.github.dft.ebay.model.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "RegistrationAddress")
public class RegistrationAddress {

    @JacksonXmlProperty(localName = "CityName")
    private String cityName;

    @JacksonXmlProperty(localName = "CompanyName")
    private String companyName;

    @JacksonXmlProperty(localName = "Country")
    private String country;

    @JacksonXmlProperty(localName = "CountryName")
    private String countryName;

    @JacksonXmlProperty(localName = "Name")
    private String name;

    @JacksonXmlProperty(localName = "Phone")
    private String phone;

    @JacksonXmlProperty(localName = "PostalCode")
    private String postalCode;

    @JacksonXmlProperty(localName = "StateOrProvince")
    private String stateOrProvince;

    @JacksonXmlProperty(localName = "Street")
    private String street;

    @JacksonXmlProperty(localName = "Street1")
    private String street1;

    @JacksonXmlProperty(localName = "Street2")
    private String street2;
}
