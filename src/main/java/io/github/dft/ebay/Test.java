package io.github.dft.ebay;

import io.github.dft.ebay.model.RequesterCredentials;
import io.github.dft.ebay.model.seller.GetSellerListRequest;
import io.github.dft.ebay.model.seller.GetSellerListResponse;
import io.github.dft.ebay.model.seller.ItemType;
import io.github.dft.ebay.model.seller.Pagination;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Test {

    public static void main(String [] args) throws IOException, InterruptedException, URISyntaxException {
        RequesterCredentials accessCredentials = new RequesterCredentials();
        accessCredentials.setAppName("RakeshDo-SynkronI-PRD-c5011618f-67c76370");
        accessCredentials.setCertName("PRD-5011618fe0a4-bb7a-4217-a76d-5e57");
        accessCredentials.setDevName("d2954877-65ff-4a53-b76f-7b1dbcc8677a");
        accessCredentials.setApiCompatibilityLevel("1097");
        accessCredentials.setSiteID("3");
        accessCredentials.setEBayAuthToken("v^1.1#i^1#I^3#r^0#f^0#p^3#t^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");

        /*FetchTokenRequest fetchTokenRequest = new FetchTokenRequest();
        new FetchToken(accessCredentials).fetchToken(fetchTokenRequest);

        GetUserRequest getUserRequest = new GetUserRequest();
        getUserRequest.setUserID("london-top-style");
        GetUserResponse user =  new UserAPI(accessCredentials).getUser(getUserRequest);
        System.out.println(user.getAck());
        System.out.println(user.getUser().getRegistrationDate());*/

        Pagination pagination = new Pagination();
        pagination.setPageNumber(1);
        pagination.setEntriesPerPage(50);
        GetSellerListRequest getSellerListRequest = new GetSellerListRequest();
        getSellerListRequest.setEndTimeFrom("2022-07-20T00:00:00.000Z");
        getSellerListRequest.setEndTimeTo("2022-09-26T00:00:00.000Z");
        getSellerListRequest.setGranularityLevel("Coarse");
        getSellerListRequest.setPagination(pagination);

        GetSellerListResponse res = new SellerAPI(accessCredentials).getItems(getSellerListRequest);
        List<ItemType> sk = res.getItemArray().getItem();
        for (ItemType i: sk) {
            System.out.println(i.getItemID()+"-->"+i.getPictureDetails().getPictureURL());
        }
    }
}
