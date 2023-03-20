package io.github.dft.ebay.model.order.transactions;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JacksonXmlRootElement(localName = "ItemTransactionIDArray")
public class ItemTransactionIDArray implements Serializable {

    @JacksonXmlProperty(localName = "ItemTransactionID")
    private List<ItemTransactionID> itemTransactionID;
}
