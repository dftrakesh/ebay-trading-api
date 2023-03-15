package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class EBayCollectAndRemitTaxes {

    @JacksonXmlProperty(localName = "eBayReference")
    public String eBayReference;

    @JacksonXmlProperty(localName = "TaxDetails")
    public TaxDetails taxDetails;

    @JacksonXmlProperty(localName = "TotalTaxAmount")
    public TotalTaxAmount totalTaxAmount;
}
