package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarketplaceFee {

    @JsonProperty("feeType")
    private String feeType;
    @JsonProperty("amount")
    private Amount amount;
}
