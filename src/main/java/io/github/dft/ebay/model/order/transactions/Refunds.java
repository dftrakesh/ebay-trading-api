package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Refunds {

    @JacksonXmlProperty(localName = "Refund")
    public Refund refund;
}
