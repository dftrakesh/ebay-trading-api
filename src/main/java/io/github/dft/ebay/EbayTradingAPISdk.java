package io.github.dft.ebay;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.order.GetOrdersResponse;
import lombok.Data;
import lombok.SneakyThrows;

import java.net.http.HttpClient;

@Data
public class EbayTradingAPISdk {

    protected final RequesterCredentials requesterCredentials;
    private XmlMapper xmlMapper;
    protected final HttpClient client;

    public EbayTradingAPISdk(RequesterCredentials requesterCredentials) {
        this.xmlMapper = new XmlMapper();
        this.xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.requesterCredentials = requesterCredentials;
        this.client = HttpClient.newHttpClient();
    }

    @SneakyThrows
    public String toStr(Object t) {
        xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);

        String strReturn = xmlMapper.writeValueAsString(t);
        return strReturn;
    }

    @SneakyThrows
    public <T> T  toObj(String response,Class<T> var) {
        return xmlMapper.readValue(response, var);
    }
}
