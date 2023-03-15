package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class ExternalTransaction {

    @JacksonXmlProperty(localName = "ExternalTransactionID")
    public String externalTransactionID;

    @JacksonXmlProperty(localName = "ExternalTransactionStatus")
    public String externalTransactionStatus;

    @JacksonXmlProperty(localName = "ExternalTransactionTime")
    public String externalTransactionTime;

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    public String feeOrCreditAmount;

    @JacksonXmlProperty(localName = "PaymentOrRefundAmount")
    public String paymentOrRefundAmount;
}
