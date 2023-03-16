package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Status {

    @JacksonXmlProperty(localName = "DigitalStatus")
    private String digitalStatus;

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
