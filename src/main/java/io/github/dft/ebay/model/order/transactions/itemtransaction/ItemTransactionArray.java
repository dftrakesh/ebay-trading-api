package io.github.dft.ebay.model.order.transactions.itemtransaction;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "TransactionArray")
public class ItemTransactionArray implements Serializable {

    @JacksonXmlProperty(localName = "Transaction")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ItemTransaction> itemTransactions;
}
