package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.io.Serializable;

@Data
public class Payee implements Serializable {

    @JacksonXmlProperty(localName = "type")
    private String type;

    @JacksonXmlText
    private String text;
}