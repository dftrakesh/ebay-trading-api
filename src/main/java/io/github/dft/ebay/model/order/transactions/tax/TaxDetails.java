package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "TaxDetails")
public class TaxDetails {

    @JacksonXmlProperty(localName = "Imposition")
    public String imposition;

    @JacksonXmlProperty(localName = "TaxDescription")
    public String taxDescription;

    @JacksonXmlProperty(localName = "TaxAmount")
    public TaxAmount taxAmount;

    @JacksonXmlProperty(localName = "TaxCode")
    public String taxCode;

    @JacksonXmlProperty(localName = "TaxOnSubtotalAmount")
    public TaxOnSubtotalAmount taxOnSubtotalAmount;

    @JacksonXmlProperty(localName = "TaxOnShippingAmount")
    public TaxOnShippingAmount taxOnShippingAmount;

    @JacksonXmlProperty(localName = "TaxOnHandlingAmount")
    public TaxOnHandlingAmount taxOnHandlingAmount;
}

