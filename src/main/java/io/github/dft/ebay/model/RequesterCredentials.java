package io.github.dft.ebay.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class RequesterCredentials {

    private String eBayAuthToken;
    private String devName;
    private String appName;
    private String certName;
    private String scopes;
    private String ruName;
    private String siteID;
    private String apiCompatibilityLevel;
}
