package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class PackageWidth {

    @JacksonXmlProperty(localName = "measurementSystem")
    public String measurementSystem;

    @JacksonXmlProperty(localName = "unit")
    public String unit;
    
    @JacksonXmlText
    public Integer text;
}
