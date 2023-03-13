package io.github.dft.ebay.model.token;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class RefreshTokenRequest {

    @JsonProperty("code")
    private String code;

    @JsonProperty("redirect_uri")
    private String redirectURI;

    private String appId;

    private String certId;
}
