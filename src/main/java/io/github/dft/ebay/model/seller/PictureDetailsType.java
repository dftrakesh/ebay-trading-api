package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureDetailsType implements Serializable {

    @JacksonXmlProperty(localName = "PictureURL")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> pictureURL;
}
