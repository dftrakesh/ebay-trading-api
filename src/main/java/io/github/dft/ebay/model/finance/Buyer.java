package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Buyer {

    @JsonProperty("username")
    private String username;
}
