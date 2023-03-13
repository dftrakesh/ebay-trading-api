package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "TransactionArray")
public class OrderTransactionArray {

    @JacksonXmlProperty(localName = "Transaction")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<OrderTransaction> orderTransactions;
}
