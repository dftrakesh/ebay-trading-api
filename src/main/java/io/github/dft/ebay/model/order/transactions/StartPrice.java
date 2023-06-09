package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;
import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "StartPrice")
public class StartPrice implements Serializable {

    @JacksonXmlProperty(localName = "currencyID", isAttribute = true)
    private String currencyID;

    @JacksonXmlText
    private Double text;
}