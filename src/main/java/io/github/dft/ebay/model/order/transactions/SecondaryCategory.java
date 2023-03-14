package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class SecondaryCategory implements Serializable {

    @JacksonXmlProperty(localName = "CategoryID")
    public Integer categoryID;
}
