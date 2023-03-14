package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Refund {

    @JacksonXmlProperty(localName = "FeeOrCreditAmount")
    public String feeOrCreditAmount;

    @JacksonXmlProperty(localName = "ReferenceID")
    public ReferenceID referenceID;

    @JacksonXmlProperty(localName = "RefundAmount")
    public String refundAmount;

    @JacksonXmlProperty(localName = "RefundStatus")
    public String refundStatus;

    @JacksonXmlProperty(localName = "RefundTime")
    public String refundTime;

    @JacksonXmlProperty(localName = "RefundTo")
    public String refundTo;

    @JacksonXmlProperty(localName = "RefundType")
    public String refundType;
}
