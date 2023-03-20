package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class PaymentHoldDetails {

    @JacksonXmlProperty(localName = "ExpectedReleaseDate")
    private String expectedReleaseDate;

    @JacksonXmlProperty(localName = "NumOfReqSellerActions")
    private String numOfReqSellerActions;

    @JacksonXmlProperty(localName = "PaymentHoldReason")
    private String paymentHoldReason;

    @JacksonXmlProperty(localName = "RequiredSellerActionArray")
    private String requiredSellerActionArray;
}
