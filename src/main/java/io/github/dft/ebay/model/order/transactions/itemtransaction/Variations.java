package io.github.dft.ebay.model.order.transactions.itemtransaction;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.seller.Variation;
import lombok.Data;

@Data
public class Variations {

    @JacksonXmlProperty(localName = "Variation")
    private Variation Variation;
}