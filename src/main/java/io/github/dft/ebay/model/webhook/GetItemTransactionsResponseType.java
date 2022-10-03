package io.github.dft.ebay.model.webhook;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "GetItemTransactionsResponseType")
public class GetItemTransactionsResponseType implements Serializable {
    private static final long serialVersionUID = 12343L;

    @JacksonXmlProperty(localName = "TransactionArray")
    private TransactionArrayType transactionArray;
}
