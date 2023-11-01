package io.github.dft.ebay.model.finance;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction {
    @JsonProperty("transactionId")
    private String transactionId;

    @JsonProperty("payoutId")
    private String payoutId;

    @JsonProperty("salesRecordReference")
    private String salesRecordReference;

    @JsonProperty("transactionType")
    private String transactionType;

    @JsonProperty("amount")
    private Amount amount;

    @JsonProperty("bookingEntry")
    private String bookingEntry;

    @JsonProperty("transactionDate")
    private String transactionDate;

    @JsonProperty("transactionStatus")
    private String transactionStatus;

    @JsonProperty("paymentsEntity")
    private String paymentsEntity;

    @JsonProperty("references")
    private List<Reference> references;

    @JsonProperty("feeType")
    private String feeType;

    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("buyer")
    private Buyer buyer;

    @JsonProperty("ebayCollectedTaxAmount")
    private TotalFeeAmount ebayCollectedTaxAmount;

    @JsonProperty("totalFeeBasisAmount")
    private TotalFeeBasisAmount totalFeeBasisAmount;

    @JsonProperty("totalFeeAmount")
    private TotalFeeAmount totalFeeAmount;

    @JsonProperty("orderLineItems")
    private List<OrderLineItem> orderLineItems;
}
