package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PaymentHoldDetails {

    @JacksonXmlProperty(localName = "ExpectedReleaseDate")
    public String expectedReleaseDate;

    @JacksonXmlProperty(localName = "NumOfReqSellerActions")
    public String numOfReqSellerActions;

    @JacksonXmlProperty(localName = "PaymentHoldReason")
    public String paymentHoldReason;

    @JacksonXmlProperty(localName = "RequiredSellerActionArray")
    public String requiredSellerActionArray;
}
