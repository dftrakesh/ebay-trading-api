package io.github.dft.ebay.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class AccessToken {

    @Expose
    @SerializedName("access_token")
    private String accessToken;
    @Expose
    @SerializedName("expires_in")
    private Integer expiresIn;
    @Expose
    @SerializedName("token_type")
    private String tokenType;

}
