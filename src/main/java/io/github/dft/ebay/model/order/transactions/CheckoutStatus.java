package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class CheckoutStatus {

    @JacksonXmlProperty(localName = "eBayPaymentStatus")
    public String eBayPaymentStatus;

    @JacksonXmlProperty(localName = "LastModifiedTime")
    public String lastModifiedTime;

    @JacksonXmlProperty(localName = "PaymentMethod")
    public String paymentMethod;

    @JacksonXmlProperty(localName = "Status")
    public String status;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    public boolean integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "PaymentInstrument")
    public String paymentInstrument;
}
