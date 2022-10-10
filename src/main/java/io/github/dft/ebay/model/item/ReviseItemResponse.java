package io.github.dft.ebay.model.item;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "ReviseItemResponse")
public class ReviseItemResponse implements Serializable {

    @JacksonXmlProperty(localName = "Ack")
    private String ack;

}
