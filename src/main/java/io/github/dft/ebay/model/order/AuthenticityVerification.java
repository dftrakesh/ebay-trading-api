package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class AuthenticityVerification {

    @JacksonXmlProperty(localName = "OutcomeReason")
    public String outcomeReason;

    @JacksonXmlProperty(localName = "ServiceCost")
    public ServiceCost serviceCost;

    @JacksonXmlProperty(localName = "Status")
    public String status;
}
