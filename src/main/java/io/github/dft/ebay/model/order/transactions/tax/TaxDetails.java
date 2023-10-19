package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "TaxDetails")
public class TaxDetails {

    @JacksonXmlProperty(localName = "Imposition")
    private String imposition;

    @JacksonXmlProperty(localName = "TaxDescription")
    private String taxDescription;

    @JacksonXmlProperty(localName = "TaxAmount")
    private TaxAmount taxAmount;

    @JacksonXmlProperty(localName = "TaxCode")
    private String taxCode;

    @JacksonXmlProperty(localName = "TaxOnSubtotalAmount")
    private TaxOnSubtotalAmount taxOnSubtotalAmount;

    @JacksonXmlProperty(localName = "TaxOnShippingAmount")
    private TaxOnShippingAmount taxOnShippingAmount;

    @JacksonXmlProperty(localName = "TaxOnHandlingAmount")
    private TaxOnHandlingAmount taxOnHandlingAmount;
}

