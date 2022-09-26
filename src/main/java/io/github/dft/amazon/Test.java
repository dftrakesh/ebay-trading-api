package io.github.dft.amazon;

import io.github.dft.amazon.constantcode.ConstantCodes;
import io.github.dft.amazon.model.RequesterCredentials;
import io.github.dft.amazon.model.fetchtoken.FetchTokenRequest;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Test {

    public static void main(String [] args)  {
        RequesterCredentials accessCredentials = new RequesterCredentials();
        accessCredentials.setAppName("");
        FetchTokenRequest fetchTokenRequest = new FetchTokenRequest();
        new FetchToken(accessCredentials).fetchToken(fetchTokenRequest);
    }
}
