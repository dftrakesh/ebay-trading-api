package io.github.dft.ebay.model.handler;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.SneakyThrows;

public class XmlHandler {

    @SneakyThrows
    public static <T> T getObjectFromXmlBody(String requestBody, Class<T> responseTypeClass) {
        return new XmlMapper().readValue(requestBody, responseTypeClass);
    }
}