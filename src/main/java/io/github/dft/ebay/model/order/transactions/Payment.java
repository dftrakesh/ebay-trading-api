package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {

    @JacksonXmlProperty(localName = "PaymentStatus")
    private String paymentStatus;

    @JacksonXmlProperty(localName = "Payer")
    private Payer payer;

    @JacksonXmlProperty(localName = "Payee")
    private Payee payee;

    @JacksonXmlProperty(localName = "PaymentTime")
    private String paymentTime;

    @JacksonXmlProperty(localName = "PaymentAmount")
    private String paymentAmount;

    @JacksonXmlProperty(localName = "ReferenceID")
    private ReferenceID referenceID;

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    private String feeOrCreditAmount;
}
