package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ShipToAddress {

    @JacksonXmlProperty(localName = "AddressAttribute")
    private String addressAttribute;

    @JacksonXmlProperty(localName = "AddressID")
    private String addressID;

    @JacksonXmlProperty(localName = "AddressOwner")
    private String addressOwner;

    @JacksonXmlProperty(localName = "AddressUsage")
    private String addressUsage;

    @JacksonXmlProperty(localName = "CityName")
    private String cityName;

    @JacksonXmlProperty(localName = "Country")
    private String country;

    @JacksonXmlProperty(localName = "CountryName")
    private String countryName;

    @JacksonXmlProperty(localName = "ExternalAddressID")
    private String externalAddressID;

    @JacksonXmlProperty(localName = "Name")
    private String name;

    @JacksonXmlProperty(localName = "Phone")
    private String phone;

    @JacksonXmlProperty(localName = "PostalCode")
    private String postalCode;

    @JacksonXmlProperty(localName = "ReferenceID")
    private String referenceID;

    @JacksonXmlProperty(localName = "StateOrProvince")
    private String stateOrProvince;

    @JacksonXmlProperty(localName = "Street1")
    private String street1;

    @JacksonXmlProperty(localName = "Street2")
    private String street2;
}
