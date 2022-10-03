package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TransactionArray implements Serializable {

    @JacksonXmlProperty(localName = "TransactionArray")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Transaction> transaction;

}
