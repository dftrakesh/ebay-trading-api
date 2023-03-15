package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ShipToAddress {

    @JacksonXmlProperty(localName = "AddressAttribute")
    public String addressAttribute;

    @JacksonXmlProperty(localName = "AddressID")
    public String addressID;

    @JacksonXmlProperty(localName = "AddressOwner")
    public String addressOwner;

    @JacksonXmlProperty(localName = "AddressUsage")
    public String addressUsage;

    @JacksonXmlProperty(localName = "CityName")
    public String cityName;

    @JacksonXmlProperty(localName = "Country")
    public String country;

    @JacksonXmlProperty(localName = "CountryName")
    public String countryName;

    @JacksonXmlProperty(localName = "ExternalAddressID")
    public String externalAddressID;

    @JacksonXmlProperty(localName = "Name")
    public String name;

    @JacksonXmlProperty(localName = "Phone")
    public String phone;

    @JacksonXmlProperty(localName = "PostalCode")
    public String postalCode;

    @JacksonXmlProperty(localName = "ReferenceID")
    public String referenceID;

    @JacksonXmlProperty(localName = "StateOrProvince")
    public String stateOrProvince;

    @JacksonXmlProperty(localName = "Street1")
    public String street1;

    @JacksonXmlProperty(localName = "Street2")
    public String street2;
}
