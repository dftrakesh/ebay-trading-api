package io.github.dft.ebay;

import io.github.dft.ebay.model.EbayCredentials;
import io.github.dft.ebay.model.handler.JsonBodyHandler;
import io.github.dft.ebay.model.token.AccessToken;
import io.github.dft.ebay.model.token.AccessTokenRequest;
import io.github.dft.ebay.model.token.RefreshTokenRequest;
import io.github.dft.ebay.model.token.RefreshTokenResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class TokenAPI extends EbayTradingAPISdk {

    private final String KEY_NAME_SCOPE = "scope";
    private final String KEY_NAME_GRANT_TYPE = "grant_type";
    private final String KEY_NAME_REFRESH_TOKEN = "refresh_token";
    private final String KEY_NAME_ACCESS_TOKEN = "authorization_code";
    private final String KEY_NAME_ACCESS_REDIRECT_URI = "redirect_uri";
    private final String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    private final String HTTP_HEADER_KEY_AUTHORIZATION = "Authorization";
    private final String HTTP_HEADER_CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded";
    private final String EBAY_AUTHORIZED_TOKEN_URL = "https://api.ebay.com/identity/v1/oauth2/token";

    public TokenAPI() {
        super(new EbayCredentials());
    }

    @SneakyThrows
    public RefreshTokenResponse getRefreshToken(RefreshTokenRequest refreshTokenRequest) {

        String requestData = KEY_NAME_GRANT_TYPE + "=" + KEY_NAME_ACCESS_TOKEN + "&" +
                String.format("code" + "=%s", refreshTokenRequest.getCode()) + "&" +
                String.format(KEY_NAME_ACCESS_REDIRECT_URI + "=%s", refreshTokenRequest.getRedirectURI());

        HttpRequest request = HttpRequest.newBuilder(new URI(EBAY_AUTHORIZED_TOKEN_URL))
                .header(HTTP_HEADER_KEY_AUTHORIZATION, buildAuthorization(refreshTokenRequest.getAppId(), refreshTokenRequest.getCertId()))
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_URLENCODED)
                .POST(HttpRequest.BodyPublishers.ofString(requestData))
                .build();
        HttpResponse.BodyHandler<RefreshTokenResponse> handler = new JsonBodyHandler(RefreshTokenResponse.class);
        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public AccessToken getAccessTokenFromRefreshToken(AccessTokenRequest accessTokenRequest) {

        String requestData = KEY_NAME_GRANT_TYPE + "=" + KEY_NAME_REFRESH_TOKEN + "&" +
                String.format(KEY_NAME_SCOPE + "=%s", accessTokenRequest.getScopes()) + "&" +
                String.format(KEY_NAME_REFRESH_TOKEN + "=%s", accessTokenRequest.getRefreshToken());

        HttpRequest request = HttpRequest.newBuilder(new URI(EBAY_AUTHORIZED_TOKEN_URL))
                .header(HTTP_HEADER_KEY_AUTHORIZATION, buildAuthorization(accessTokenRequest.getAppId(), accessTokenRequest.getCertId()))
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

    private String buildAuthorization(String appID, String certID) {
        byte[] encodeBytes = Base64.getEncoder().encode((appID + ":" + certID).getBytes());
        return "Basic " + new String(encodeBytes);
    }
}