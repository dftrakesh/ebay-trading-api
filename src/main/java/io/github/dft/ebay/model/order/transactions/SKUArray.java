package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SKUArray implements Serializable {

    @JacksonXmlProperty(localName = "SKU")
    private List<String> sku;
}
