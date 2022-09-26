package io.github.dft.amazon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

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
    private String apiCompatibilityLevel;
}
