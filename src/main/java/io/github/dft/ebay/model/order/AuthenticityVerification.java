package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class AuthenticityVerification {

    @JacksonXmlProperty(localName = "OutcomeReason")
    private String outcomeReason;

    @JacksonXmlProperty(localName = "ServiceCost")
    private ServiceCost serviceCost;

    @JacksonXmlProperty(localName = "Status")
    private String status;
}
