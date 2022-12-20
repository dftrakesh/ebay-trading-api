package io.github.dft.ebay.model.order;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class OrderRequest {

    @JacksonXmlProperty(localName = "OrderID")
    @JacksonXmlElementWrapper(useWrapping = false)
    protected List<String> orderID;
}