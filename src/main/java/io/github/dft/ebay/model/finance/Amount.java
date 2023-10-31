package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Amount {

    @JsonProperty("value")
    private String value;
    @JsonProperty("currency")
    private String currency;
}
