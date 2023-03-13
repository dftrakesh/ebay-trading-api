package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.seller.Pagination;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetItemTransactionsRequest {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "ItemID")
    private String itemID;

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken RequesterCredentials;

    @JacksonXmlProperty(localName = "TransactionID")
    private String transactionID;

    @JacksonXmlProperty(localName = "ModTimeFrom")
    private String modTimeFrom;

    @JacksonXmlProperty(localName = "ModTimeTo")
    private String modTimeTo;

    @JacksonXmlProperty(localName = "IncludeFinalValueFee")
    public boolean includeFinalValueFee;

    @JacksonXmlProperty(localName = "NumberOfDays")
    private String numberOfDays;

    @JacksonXmlProperty(localName = "Pagination")
    private Pagination pagination;

    @JacksonXmlProperty(localName = "DetailLevel")
    private String detailLevel;
}