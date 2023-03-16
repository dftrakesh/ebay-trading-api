package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PackageLength {

    @JacksonXmlProperty(localName = "measurementSystem")
    private String measurementSystem;

    @JacksonXmlProperty(localName = "unit")
    private String unit;

    @JacksonXmlProperty(localName = "text")
    private Integer text;
}
