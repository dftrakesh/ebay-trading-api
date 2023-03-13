package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ExternalTransaction implements Serializable {

    @JacksonXmlProperty(localName = "ExternalTransactionID")
    public String externalTransactionID;

    @JacksonXmlProperty(localName = "ExternalTransactionTime")
    public String externalTransactionTime;

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    public String feeOrCreditAmount;

    @JacksonXmlProperty(localName = "PaymentOrRefundAmount")
    public String paymentOrRefundAmount;

    @JacksonXmlProperty(localName = "ExternalTransactionStatus")
    public String externalTransactionStatus;
}

