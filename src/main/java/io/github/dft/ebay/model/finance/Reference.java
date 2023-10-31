package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Reference {

    @JsonProperty("referenceId")
    private String referenceId;
    @JsonProperty("referenceType")
    private String referenceType;
}
