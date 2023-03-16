package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.io.Serializable;

@Data
public class ReferenceID implements Serializable {

    @JacksonXmlProperty(localName = "type",isAttribute = true)
    private String type;

    @JacksonXmlText
    private String text;
}
