package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MonetaryDetails implements Serializable {

    @JacksonXmlProperty(localName = "Payments")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Payments> payments;

    @JacksonXmlProperty(localName = "Refunds")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Refunds> refunds;
}