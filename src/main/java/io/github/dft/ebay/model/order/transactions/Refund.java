package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Refund {

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    private String feeOrCreditAmount;

    @JacksonXmlProperty(localName = "ReferenceID")
    private ReferenceID referenceID;

    @JacksonXmlProperty(localName = "RefundAmount")
    private String refundAmount;

    @JacksonXmlProperty(localName = "RefundStatus")
    private String refundStatus;

    @JacksonXmlProperty(localName = "RefundTime")
    private String refundTime;

    @JacksonXmlProperty(localName = "RefundTo")
    private String refundTo;

    @JacksonXmlProperty(localName = "RefundType")
    private String refundType;
}
