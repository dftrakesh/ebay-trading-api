package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ExternalTransaction {

    @JacksonXmlProperty(localName = "ExternalTransactionID")
    private String externalTransactionID;

    @JacksonXmlProperty(localName = "ExternalTransactionStatus")
    private String externalTransactionStatus;

    @JacksonXmlProperty(localName = "ExternalTransactionTime")
    private String externalTransactionTime;

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    private String feeOrCreditAmount;

    @JacksonXmlProperty(localName = "PaymentOrRefundAmount")
    private String paymentOrRefundAmount;
}
