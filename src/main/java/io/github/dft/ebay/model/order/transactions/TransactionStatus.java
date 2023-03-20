package io.github.dft.ebay.model.order.transactions;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class TransactionStatus implements Serializable {

    @JacksonXmlProperty(localName = "eBayPaymentStatus")
    private String eBayPaymentStatus;

    @JacksonXmlProperty(localName = "CheckoutStatus")
    private String checkoutStatus;

    @JacksonXmlProperty(localName = "LastTimeModified")
    private String lastTimeModified;

    @JacksonXmlProperty(localName = "PaymentMethodUsed")
    private String paymentMethodUsed;

    @JacksonXmlProperty(localName = "CompleteStatus")
    private String completeStatus;

    @JacksonXmlProperty(localName = "BuyerSelectedShipping")
    private boolean buyerSelectedShipping;

    @JacksonXmlProperty(localName = "PaymentHoldStatus")
    private String paymentHoldStatus;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    private boolean integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "InquiryStatus")
    private String inquiryStatus;

    @JacksonXmlProperty(localName = "ReturnStatus")
    private String returnStatus;

    @JacksonXmlProperty(localName = "PaymentInstrument")
    private String paymentInstrument;
}
