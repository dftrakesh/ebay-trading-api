package io.github.dft.amazon;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.dft.amazon.model.RequesterCredentials;
import lombok.Data;
import lombok.SneakyThrows;

@Data
public class EbayTradingAPISdk {

    private XmlMapper xmlMapper;
    protected final RequesterCredentials requesterCredentials;

    public EbayTradingAPISdk(RequesterCredentials requesterCredentials) {
        this.xmlMapper = new XmlMapper();
        this.requesterCredentials = requesterCredentials;
    }

    @SneakyThrows
    public String toStr(Object t) {
        return xmlMapper.writeValueAsString(t);
    }
}
