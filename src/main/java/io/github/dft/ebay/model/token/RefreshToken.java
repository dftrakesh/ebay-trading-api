package io.github.dft.ebay.model.token;

import lombok.Data;

import java.util.Date;

@Data
public class RefreshToken {

    private String token;
    private Date expiresOn;
    private TokenType tokenType = TokenType.USER;
}
