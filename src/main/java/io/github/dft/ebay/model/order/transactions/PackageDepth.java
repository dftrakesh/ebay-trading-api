package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class PackageDepth {

    @JacksonXmlProperty(localName = "measurementSystem")
    private String measurementSystem;

    @JacksonXmlProperty(localName = "unit")
    private String unit;

    @JacksonXmlText
    private Integer text;
}
