package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderLineItem {


    @JsonProperty("lineItemId")
    private String lineItemId;
    @JsonProperty("feeBasisAmount")
    private TotalFeeBasisAmount feeBasisAmount;
    @JsonProperty("marketplaceFees")
    private List<MarketplaceFee> marketplaceFees;
}
