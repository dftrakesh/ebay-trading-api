package io.github.dft.ebay.model.order.transactions.itemtransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.seller.PaginationResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@JacksonXmlRootElement(localName = "GetItemTransactionsResponse")
public class GetItemTransactionsResponse {


    @JacksonXmlProperty(localName = "Ack")
    private String ack;

    @JacksonXmlProperty(localName = "PaginationResult")
    private PaginationResult paginationResult;

    @JacksonXmlProperty(localName = "Item")
    private Item item;

    @JacksonXmlProperty(localName = "HasMoreTransactions")
    private Boolean hasMoreTransactions;

    @JacksonXmlProperty(localName = "TransactionsPerPage")
    private Integer transactionsPerPage;

    @JacksonXmlProperty(localName = "PageNumber")
    private Integer pageNumber;

    @JacksonXmlProperty(localName = "ReturnedTransactionCountActual")
    private Integer returnedTransactionCountActual;

    @JacksonXmlProperty(localName = "TransactionArray")
    private ItemTransactionArray itemtransactionArray;
}