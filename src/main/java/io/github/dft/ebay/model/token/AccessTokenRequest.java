package io.github.dft.ebay.model.token;


import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class AccessTokenRequest {

    private String refreshToken;
    private String appId;
    private String certId;
}
