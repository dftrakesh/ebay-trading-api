package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "ErrorParameters")
public class ErrorParameterType {

    @JacksonXmlProperty(localName = "Value")
    private String value;

    @JacksonXmlProperty(isAttribute = true, localName = "ParamID")
    private String paramID;
}