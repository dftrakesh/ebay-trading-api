package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.util.List;

@Data
@JacksonXmlRootElement(localName = "Errors")
public class ErrorType {

    @JacksonXmlProperty(localName = "ShortMessage")
    private String shortMessage;

    @JacksonXmlProperty(localName = "LongMessage")
    private String longMessage;

    @JacksonXmlProperty(localName = "ErrorCode")
    protected String errorCode;

    @JacksonXmlProperty(localName = "UserDisplayHint")
    private Boolean userDisplayHint;

    @JacksonXmlProperty(localName = "SeverityCode")
    private String severityCode;

    @JacksonXmlProperty(localName = "ErrorParameters")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ErrorParameterType> errorParameters;

    @JacksonXmlProperty(localName = "ErrorClassification")
    private String errorClassification;
}