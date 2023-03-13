package io.github.dft.ebay.model.order.transactions.tax;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class TaxTable {

    @JacksonXmlProperty(localName = "TaxJurisdiction")
    public TaxJurisdiction taxJurisdiction;
}
