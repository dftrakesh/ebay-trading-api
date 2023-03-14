package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Payments implements Serializable {

    @JacksonXmlProperty(localName = "Payment")
    public Payment payment;
}

