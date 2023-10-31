package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "ListingDetails")
public class ListingDetails implements Serializable {

    @JacksonXmlProperty(localName = "StartTime")
    private String startTime;

    @JacksonXmlProperty(localName = "EndTime")
    private String endTime;

    @JacksonXmlProperty(localName = "ViewItemURL")
    private String viewItemURL;

    @JacksonXmlProperty(localName = "ViewItemURLForNaturalSearch")
    private String viewItemURLForNaturalSearch;
}
