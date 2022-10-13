package io.github.dft.ebay;

import io.github.dft.ebay.constant.ConstantCodes;
import io.github.dft.ebay.model.handler.JsonBodyHandler;
import io.github.dft.ebay.model.token.AccessToken;
import io.github.dft.ebay.model.token.AccessTokenRequest;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

import static io.github.dft.ebay.constant.ConstantCodes.*;

public class TokenAPI extends EbayTradingAPISdk {

    public TokenAPI() {
        super(null);
    }

    @SneakyThrows
    public AccessToken getRefreshTokenFromAccessToken(AccessTokenRequest accessTokenRequest) {
        String requestData = KEY_NAME_GRANT_TYPE + "=" + KEY_NAME_REFRESH_TOKEN + "&" +
                String.format(KEY_NAME_SCOPE + "=%s", ConstantCodes.EBAY_PD_SCOPES) + "&" +
                String.format(KEY_NAME_REFRESH_TOKEN + "=%s", accessTokenRequest.getRefreshToken());

        HttpRequest request = HttpRequest.newBuilder(new URI(EBAY_AUTHORIZED_TOKEN_URL))
                .header(HTTP_HEADER_KEY_AUTHORIZATION, buildAuthorization(accessTokenRequest))
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_URLENCODED)
                .POST(HttpRequest.BodyPublishers.ofString(requestData))
                .build();
        try {
            HttpResponse.BodyHandler<AccessToken> handler = new JsonBodyHandler(AccessToken.class);
            return getRequestWrapped(request, handler);
        } catch (Throwable var4) {
            throw var4;
        }
    }

    private String buildAuthorization(AccessTokenRequest request) {
        byte[] encodeBytes = Base64.getEncoder().encode((request.getAppId() + ":" + request.getCertId()).getBytes());
        return "Basic " + new String(encodeBytes);
    }
}
