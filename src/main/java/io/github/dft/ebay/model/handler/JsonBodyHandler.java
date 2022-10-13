package io.github.dft.ebay.model.handler;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class JsonBodyHandler<W> implements HttpResponse.BodyHandler<W> {
    private Class<W> wClass;

    public JsonBodyHandler(Class<W> wClass) {
        this.wClass = wClass;
    }

    public HttpResponse.BodySubscriber<W> apply(HttpResponse.ResponseInfo responseInfo) {
        return asJSON(this.wClass);
    }

    public static <T> HttpResponse.BodySubscriber<T> asJSON(Class<T> targetType) {
        HttpResponse.BodySubscriber<String> upstream = HttpResponse.BodySubscribers.ofString(StandardCharsets.UTF_8);
        return HttpResponse.BodySubscribers.mapping(upstream, (body) -> {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.readValue(body, targetType);
            } catch (IOException var3) {
                throw new UncheckedIOException(var3);
            }
        });
    }
}