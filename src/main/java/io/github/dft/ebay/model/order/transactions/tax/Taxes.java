package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Taxes")
public class Taxes {

    @JacksonXmlProperty(localName = "TotalTaxAmount")
    public TotalTaxAmount totalTaxAmount;

    @JacksonXmlProperty(localName = "TaxDetails")
    public TaxDetails taxDetails;
}
