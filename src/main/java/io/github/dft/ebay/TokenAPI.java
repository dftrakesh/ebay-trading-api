package io.github.dft.ebay;

import com.google.gson.Gson;
import io.github.dft.ebay.constant.ConstantCodes;
import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.token.AccessToken;
import io.github.dft.ebay.model.token.RefreshToken;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

import static io.github.dft.ebay.constant.ConstantCodes.*;

public class TokenAPI {


    @SneakyThrows
    public AccessToken getRefreshTokenFromAccessToken(String refreshToken, String appId, String certId) {
        String requestData = "grant_type=refresh_token" + "&" +
                String.format("scope=%s", ConstantCodes.EBAY_PD_SCOPES) + "&" +
                String.format("refresh_token=%s", refreshToken);

        HttpRequest request = HttpRequest.newBuilder(new URI(EBAY_AUTHORIZED_TOKEN_URL))
                .header(HTTP_HEADER_KEY_AUTHORIZATION, buildAuthorization(appId, certId))
                .header(HTTP_HEADER_KEY_CONTENT_TYPE, HTTP_HEADER_CONTENT_TYPE_URLENCODED)
                .POST(HttpRequest.BodyPublishers.ofString(requestData))
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());
        String strResponse = response.body();
        return new Gson().fromJson(strResponse, AccessToken.class);
    }

    private String buildAuthorization(String appId, String certId) {
        byte[] encodeBytes = Base64.getEncoder().encode((appId + ":" + certId).getBytes());
        return "Basic " + new String(encodeBytes);
    }
}
