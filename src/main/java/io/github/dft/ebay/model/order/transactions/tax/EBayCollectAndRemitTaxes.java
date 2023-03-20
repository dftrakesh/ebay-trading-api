package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class EBayCollectAndRemitTaxes {

    @JacksonXmlProperty(localName = "eBayReference")
    private String eBayReference;

    @JacksonXmlProperty(localName = "TaxDetails")
    private TaxDetails taxDetails;

    @JacksonXmlProperty(localName = "TotalTaxAmount")
    private TotalTaxAmount totalTaxAmount;
}
