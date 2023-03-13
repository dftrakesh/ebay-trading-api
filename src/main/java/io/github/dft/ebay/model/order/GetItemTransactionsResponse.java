package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.seller.PaginationResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
@JacksonXmlRootElement(localName = "GetItemTransactionsResponse")
public class GetItemTransactionsResponse {

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "PaginationResult")
    private PaginationResult paginationResult;

    @JacksonXmlProperty(localName = "Item")
    protected Item item;

    @JacksonXmlProperty(localName = "HasMoreTransactions")
    public boolean hasMoreTransactions;

    @JacksonXmlProperty(localName = "TransactionsPerPage")
    public Integer transactionsPerPage;

    @JacksonXmlProperty(localName = "PageNumber")
    public Integer pageNumber;

    @JacksonXmlProperty(localName = "ReturnedTransactionCountActual")
    public Integer returnedTransactionCountActual;

    @JacksonXmlProperty(localName = "TransactionArray")
    public ItemTransactionArray itemtransactionArray;
}