package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "ListingDetailsType")
public class ListingDetailsType implements Serializable {

    @JacksonXmlProperty(localName = "startTime")
    protected String startTime;
}
