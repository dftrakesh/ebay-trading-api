package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class PackageLength {

    @JacksonXmlProperty(localName = "measurementSystem")
    public String measurementSystem;

    @JacksonXmlProperty(localName = "unit")
    public String unit;

    @JacksonXmlText
    public int text;
}
