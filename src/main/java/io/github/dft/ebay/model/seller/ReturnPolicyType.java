package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "ReturnPolicyType")
public class ReturnPolicyType {

    @JacksonXmlProperty(localName = "ReturnsAcceptedOption")
    private String returnsAcceptedOption;

    @JacksonXmlProperty(localName = "ShippingCostPaidByOption")
    private String shippingCostPaidByOption;

    @JacksonXmlProperty(localName = "ReturnsWithinOption")
    private String returnsWithinOption;

    @JacksonXmlProperty(localName = "RefundOption")
    private String refundOption;
}