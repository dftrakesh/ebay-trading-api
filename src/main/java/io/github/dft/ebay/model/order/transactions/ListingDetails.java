package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "ListingDetails")
public class ListingDetails implements Serializable {

    @JacksonXmlProperty(localName = "StartTime")
    public String startTime;

    @JacksonXmlProperty(localName = "EndTime")
    public String endTime;

    @JacksonXmlProperty(localName = "ViewItemURL")
    public String viewItemURL;

    @JacksonXmlProperty(localName = "ViewItemURLForNaturalSearch")
    public String viewItemURLForNaturalSearch;
}
