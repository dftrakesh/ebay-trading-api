package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.token.EbayToken;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOrdersRequest {

    @JacksonXmlProperty(isAttribute = true)
    private final String xmlns = "urn:ebay:apis:eBLBaseComponents";

    @JacksonXmlProperty(localName = "RequesterCredentials")
    private EbayToken RequesterCredentials;

    @JacksonXmlProperty(localName = "OrderIDArray")
    private OrderRequest orderIDArray;

    @JacksonXmlProperty(localName = "CreateTimeFrom")
    private String createTimeFrom;

    @JacksonXmlProperty(localName = "CreateTimeTo")
    private String createTimeTo;

    @JacksonXmlProperty(localName = "NumberOfDays")
    private Integer numberOfDays;

    @JacksonXmlProperty(localName = "OrderStatus")
    private String orderStatus;

    @JacksonXmlProperty(localName = "Version")
    private Integer version;

    @JacksonXmlProperty(localName = "DetailLevel")
    public String DetailLevel;
}