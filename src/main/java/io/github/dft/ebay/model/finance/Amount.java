package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Amount {

    @JsonProperty("value")
    private String value;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("convertedFromValue")
    private String convertedFromValue;
    @JsonProperty("convertedFromCurrency")
    private String convertedFromCurrency;
    @JsonProperty("exchangeRate")
    private String exchangeRate;
}
