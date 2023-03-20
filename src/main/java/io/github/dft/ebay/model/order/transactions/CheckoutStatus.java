package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CheckoutStatus {

    @JacksonXmlProperty(localName = "eBayPaymentStatus")
    private String eBayPaymentStatus;

    @JacksonXmlProperty(localName = "LastModifiedTime")
    private String lastModifiedTime;

    @JacksonXmlProperty(localName = "PaymentMethod")
    private String paymentMethod;

    @JacksonXmlProperty(localName = "Status")
    private String status;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    private boolean integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "PaymentInstrument")
    private String paymentInstrument;
}
