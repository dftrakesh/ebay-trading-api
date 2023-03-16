package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSellerListRequest {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "StartTimeFrom")
    private String startTimeFrom;

    @JacksonXmlProperty(localName = "StartTimeTo")
    private String startTimeTo;

    @JacksonXmlProperty(localName = "EndTimeFrom")
    private String endTimeFrom;

    @JacksonXmlProperty(localName = "EndTimeTo")
    private String endTimeTo;

    @JacksonXmlProperty(localName = "Pagination")
    private Pagination pagination;

    @JacksonXmlProperty(localName = "GranularityLevel")
    private String granularityLevel;

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken requesterCredentials;

    @JacksonXmlProperty(localName = "IncludeVariations")
    private boolean includeVariations;

    @JacksonXmlProperty(localName = "IncludeWatchCount")
    private boolean includeWatchCount;
}
