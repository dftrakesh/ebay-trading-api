package io.github.dft.ebay.model.enditem;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class EndItemRequest {
    private EbayToken requesterCredentials;
    private String itemID;
    private EndReasonCodeType endingReason;
    private String xmlns;
    private String text;
}