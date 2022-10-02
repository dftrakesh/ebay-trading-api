package io.github.dft.ebay.model.webhook;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JacksonXmlRootElement(localName = "TransactionArrayType")
public class TransactionArrayType implements Serializable {
    private static final long serialVersionUID = 12343L;

    @JacksonXmlProperty(localName = "Transaction")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<TransactionType> transaction;
}
