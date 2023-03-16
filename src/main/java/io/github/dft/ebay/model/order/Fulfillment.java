package io.github.dft.ebay.model.order;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Fulfillment {

    @JacksonXmlProperty(localName = "FulfillmentBy")
    private String fulfillmentBy;

    @JacksonXmlProperty(localName = "FulfillmentRefId")
    private String fulfillmentRefId;
}

