package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalFeeBasisAmount {

    @JsonProperty("value")
    private String value;
    @JsonProperty("currency")
    private String currency;
}
