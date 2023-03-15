package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Status {

    @JacksonXmlProperty(localName = "DigitalStatus")
    public String digitalStatus;

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
