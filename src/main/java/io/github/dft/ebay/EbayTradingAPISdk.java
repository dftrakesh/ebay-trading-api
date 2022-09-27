package io.github.dft.ebay;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import io.github.dft.ebay.model.RequesterCredentials;
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
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
        return xmlMapper.writeValueAsString(t);
    }
}
