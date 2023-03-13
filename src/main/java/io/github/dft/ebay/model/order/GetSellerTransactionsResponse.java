package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.seller.PaginationResult;
import lombok.Data;

import java.io.Serializable;


@Data
@JacksonXmlRootElement(localName = "GetSellerListResponse")
public class GetSellerTransactionsResponse implements Serializable {

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "PaginationResult")
    private PaginationResult paginationResult;

    @JacksonXmlProperty(localName = "HasMoreTransactions")
    public boolean hasMoreTransactions;

    @JacksonXmlProperty(localName = "TransactionsPerPage")
    public Integer transactionsPerPage;

    @JacksonXmlProperty(localName = "PageNumber")
    public Integer pageNumber;

    @JacksonXmlProperty(localName = "ReturnedTransactionCountActual")
    public Integer returnedTransactionCountActual;

    @JacksonXmlProperty(localName = "TransactionArray")
    public ItemTransactionArray transactionArray;
}