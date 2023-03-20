package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ExternalTransaction implements Serializable {

    @JacksonXmlProperty(localName = "ExternalTransactionID")
    private String externalTransactionID;

    @JacksonXmlProperty(localName = "ExternalTransactionTime")
    private String externalTransactionTime;

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    private String feeOrCreditAmount;

    @JacksonXmlProperty(localName = "PaymentOrRefundAmount")
    private String paymentOrRefundAmount;

    @JacksonXmlProperty(localName = "ExternalTransactionStatus")
    private String externalTransactionStatus;
}

