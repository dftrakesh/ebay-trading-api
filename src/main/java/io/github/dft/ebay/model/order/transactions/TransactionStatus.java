package io.github.dft.ebay.model.order.transactions;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class TransactionStatus implements Serializable {

    @JacksonXmlProperty(localName = "eBayPaymentStatus")
    public String eBayPaymentStatus;

    @JacksonXmlProperty(localName = "CheckoutStatus")
    public String checkoutStatus;

    @JacksonXmlProperty(localName = "LastTimeModified")
    public String lastTimeModified;

    @JacksonXmlProperty(localName = "PaymentMethodUsed")
    public String paymentMethodUsed;

    @JacksonXmlProperty(localName = "CompleteStatus")
    public String completeStatus;

    @JacksonXmlProperty(localName = "BuyerSelectedShipping")
    public boolean buyerSelectedShipping;

    @JacksonXmlProperty(localName = "PaymentHoldStatus")
    public String paymentHoldStatus;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    public boolean integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "InquiryStatus")
    public String inquiryStatus;

    @JacksonXmlProperty(localName = "ReturnStatus")
    public String returnStatus;

    @JacksonXmlProperty(localName = "PaymentInstrument")
    public String paymentInstrument;
}
