package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PackageLength {

    @JacksonXmlProperty(localName = "measurementSystem")
    public String measurementSystem;

    @JacksonXmlProperty(localName = "unit")
    public String unit;

    @JacksonXmlProperty(localName = "text")
    public Integer text;
}
