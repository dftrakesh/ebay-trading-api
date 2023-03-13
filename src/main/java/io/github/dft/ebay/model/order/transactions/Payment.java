package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Payment implements Serializable {

    @JacksonXmlProperty(localName = "PaymentStatus")
    public String paymentStatus;

    @JacksonXmlProperty(localName = "Payer")
    public Payer payer;

    @JacksonXmlProperty(localName = "Payee")
    public Payee payee;

    @JacksonXmlProperty(localName = "PaymentTime")
    public String paymentTime;

    @JacksonXmlProperty(localName = "PaymentAmount")
    public String paymentAmount;

    @JacksonXmlProperty(localName = "ReferenceID")
    public ReferenceID referenceID;

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    public String feeOrCreditAmount;
}
