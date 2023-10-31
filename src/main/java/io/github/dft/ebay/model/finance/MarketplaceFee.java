package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MarketplaceFee {

    @JsonProperty("feeType")
    private String feeType;
    @JsonProperty("amount")
    private Amount amount;
}
