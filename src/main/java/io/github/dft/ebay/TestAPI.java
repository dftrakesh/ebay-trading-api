package io.github.dft.ebay;

import io.github.dft.ebay.model.AccessCredential;
import io.github.dft.ebay.model.seller.GetSellerListRequest;
import io.github.dft.ebay.model.seller.GetSellerListResponse;
import io.github.dft.ebay.model.seller.GranularityLevelCodeType;
import io.github.dft.ebay.model.seller.Pagination;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;


public class TestAPI {
    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {

        //AUTH FLOW CHECK


        AccessCredential credentials = new AccessCredential();
        credentials.setAppName("tarangba-Reportin-SBX-92fd85938-027faa5f");
        credentials.setCertName("SBX-2fd85938c8b7-1c97-4dbb-a63d-1bd7");
        credentials.setDevName("dc66dda3-2fc4-435e-a05f-f07174d0461d");
//        credentials.setRuName("tarang_bathani-tarangba-Report-bqzqkck");
        credentials.setApiCompatibilityLevel("967");
//        credentials.setApiCompatibilityLevel("1113");
        credentials.setScopes("https://api.ebay.com/oauth/api_scope https://api.ebay.com/oauth/api_scope/buy.order.readonly https://api.ebay.com/oauth/api_scope/buy.guest.order https://api.ebay.com/oauth/api_scope/sell.marketing.readonly https://api.ebay.com/oauth/api_scope/sell.marketing https://api.ebay.com/oauth/api_scope/sell.inventory.readonly https://api.ebay.com/oauth/api_scope/sell.inventory https://api.ebay.com/oauth/api_scope/sell.account.readonly https://api.ebay.com/oauth/api_scope/sell.account https://api.ebay.com/oauth/api_scope/sell.fulfillment.readonly https://api.ebay.com/oauth/api_scope/sell.fulfillment https://api.ebay.com/oauth/api_scope/sell.analytics.readonly https://api.ebay.com/oauth/api_scope/sell.marketplace.insights.readonly https://api.ebay.com/oauth/api_scope/commerce.catalog.readonly https://api.ebay.com/oauth/api_scope/buy.shopping.cart https://api.ebay.com/oauth/api_scope/buy.offer.auction https://api.ebay.com/oauth/api_scope/commerce.identity.readonly https://api.ebay.com/oauth/api_scope/commerce.identity.email.readonly https://api.ebay.com/oauth/api_scope/commerce.identity.phone.readonly https://api.ebay.com/oauth/api_scope/commerce.identity.address.readonly https://api.ebay.com/oauth/api_scope/commerce.identity.name.readonly https://api.ebay.com/oauth/api_scope/commerce.identity.status.readonly https://api.ebay.com/oauth/api_scope/sell.finances https://api.ebay.com/oauth/api_scope/sell.item.draft https://api.ebay.com/oauth/api_scope/sell.payment.dispute https://api.ebay.com/oauth/api_scope/sell.item https://api.ebay.com/oauth/api_scope/sell.reputation https://api.ebay.com/oauth/api_scope/sell.reputation.readonly https://api.ebay.com/oauth/api_scope/commerce.notification.subscription https://api.ebay.com/oauth/api_scope/commerce.notification.subscription.readonly");
        credentials.setEBayAuthToken("v^1.1#i^1#I^3#p^3#f^0#r^0#t^H4sIAAAAAAAAAOVYe4wTRRi/3gMFQYPiKaCxLhjjY9vZR7fblZbsXYtX4Xq9bu/A80FmZ2fb9ba7dR/cHWq4nEIIRuMjRpEYMYoRNSE+IkaNURM1iKLGRyL+41sTRUUiPv5QZ8txHKdCtJo0um3S7Mw3M9/v9/2+6TcDRqdNP3dd17ofZoWOad48CkabQyHmODB9Wtt5x7c0z2trApMMQptHF462jrV8sciFFbMqFbBbtS0Xh4crpuVKtcYk5TuWZEPXcCULVrAreUhS5O5lEhsBUtWxPRvZJhXOppOUzkEtziYEVdNifAKwpNU6OGfRTlIiYNlYXE3EYoIoqDhO+l3Xx1nL9aDlJSkWsBwNePItAl5iOYmPRUSRH6DC/dhxDdsiJhFApWruSrWxziRfj+wqdF3seGQSKpWVlyg9cjadyRUXRSfNlRrnQfGg57uHv3XaGg73Q9PHR17GrVlLio8Qdl0qmjqwwuGTSvJBZ/6G+zWqGQ5rSOcBUnlGT0DtH6Fyie1UoHdkP4IWQ6P1mqmELc/wRo7GKGFDvQIjb/wtR6bIpsPBT68PTUM3sJOkMh3yxX1KpkCFlXzesVcZGtZqSOMiADwQmBiVQraDaQ1D0x1f5cBU4xxPWabTtjQjYMwN52yvAxOX8VRimEnEEKMeq8eRdS9wZ7KdMEEgGAgieiCEvle2gqDiCmEhXHs9Ov0H9XBIAf+UIri4DnmYiAGVR6qO0R8pIsj1v6qKVBAYOZ+PBr5gFY7QFegMYq9qQoRpROj1K9gxNImL6Swn6iRAQkKn+YSu02pME2hGxxhgrKooIf5vxOF5jqH6Hp4QyNSOGsIkpSC7ivO2aaARaqpJbbcZl8Owm6TKnleVotGhoaHIEBexnVKUBYCJruhepqAyrkBqwtY4ujFt1ISBMBnlGpI3UiXeDBPdkcWtEpXiHC0PHW9EwaZJGg6q9jDfUlNb/wRkp2kQBopkicbC2GW7HtbqgmbaJcPqxl7Z1hoLW1+Q6yRjsum68JENBnqNhYwR4oCJ84Io1oVMrlazlYrvQdXE2QYLHi8IcZGrC16wU0sG1CXPHsRW4+VeIbOkkFG6VhZ7lmZydSEtYN3BbrkY4Gy0QMq9clYmT3fnYM9wFKuZgaFOeYkl9vb63X2JznKhd/lAVXHs7hH2olXDiCnCzhyztLAsNri6vyhgroQ7xByjCrqcTB6BpCDXj06UgpGDGyyZL2Syoq+lhbS/1B/kOgRckQXV7Miv0Lni6q5uLMuoxBXNcpQwUJdKuktGg2mDScQ4NpEAPAOAUBe2TMlvNHCQFGZcXGUYQQNQRYIARB3F9ODBCSwydW/dDYZXgZUuSKoJWkWOgQZNg84X0jTLoDipiEVAA01kSX3M1oW7GoQ5yPWGgs7Ci4pLxa6cYvp1oXODUrixohqMd8kEsGpEgj/UCLIrURuSo17QtLLmcX3lFdYMh5xKVvqO0ZjQvTJWA0W7IxaqwScnPot4TI5OUYgQrtZbQQdsNmIBnZcVZXlPob7yOY1X1bNTtY6FHvs3sIlsnOF0BtGsjuI0z5OjLGQ0lhZ1RoVIRUgX6tP1f+DQMKVh0kH+dxc40cOvT1NNtYcZC70AxkLPNodCYBE4i1kAzpzW0tfaMnOea3g4QmrziGuULOj5Do4M4pEqNJzmk5p+AJ9vQl91bd0w+MvQlZ9dcE3T5NvbzZeBUyfub6e3MMdNuswFpx3qaWNOOGUWywE++LAcHxsACw71tjLtrXPmhm7bnwrv+Ljltf0/7tXPbl916ZsqmDVhFAq1NRH5Nc24/JiuT96Z++3aq+9G5V2X3LJm00Pv337jtTdo3+8uTNusfrT6pjnvspePPtI2Y1fTmneSdxz7/th125/79Z4TzvnkFXHdnps/yH6XHb3q653DC/Y3734jVN355vbtX5beSvZtye/LfPfUxuk//xTf5rU/LT+8/tR98rINY8uf2PrujkVvfDNv1unzN67dkrq0b/VpG67YuvbxLfNnL9x9onr9jPvPzc2u3OU0v/78zFtXvLe3/8P8R8aeC09/9Bl6z3p5KP7lk9xtc16WZ769ESx84ZGK9PP5c9fuWtB+54uLF766d9vN809evGLbmU8Vc9s/fWlfdj314N7FOzpZ5b7Hf935IzqjfUc/vu6BlxK7n/WuWpOm7q0ciOVv8rX8TVcXAAA=");
        credentials.setSiteID("0");

//        TestAPI testAPI = new TestAPI();

//        String sddd = testAPI.buildAuthorization("tarangba-Reportin-SBX-92fd85938-027faa5f","SBX-2fd85938c8b7-1c97-4dbb-a63d-1bd7");
//        System.out.println(sddd);


//        TokenAPI tokenAPI = new TokenAPI();
//
//
//        RefreshTokenRequest refreshTokenRequest = RefreshTokenRequest.builder().appId("tarangba-Reportin-SBX-92fd85938-027faa5f").certId("SBX-2fd85938c8b7-1c97-4dbb-a63d-1bd7").redirectURI("tarang_bathani-tarangba-Report-bqzqkck").code("v^1.1#i^1#f^0#r^1#p^3#I^3#t^Ul41XzU6QjlGOTFEMEUzQjg4Q0MzNUJCNUU4QjI3QUJERTUxQjVfMl8xI0VeMTI4NA==").build();
//        System.out.println(refreshTokenRequest.toString());
//        RefreshTokenResponse refreshTokenResponse=tokenAPI.getRefreshToken(refreshTokenRequest);
//        System.out.println(refreshTokenResponse);
//
//        AccessTokenRequest accessTokenRequest = AccessTokenRequest.builder().appId("tarangba-Reportin-SBX-92fd85938-027faa5f").certId("SBX-2fd85938c8b7-1c97-4dbb-a63d-1bd7").refreshToken("v^1.1#i^1#r^1#I^3#p^3#f^0#t^Ul4xMF83OjA2NzZBMTQ5RDRDNzY4MzNCMDkyMEY2RTBDREM1OUJDXzNfMSNFXjEyODQ=").build();
//        AccessToken accessToken = tokenAPI.getAccessTokenFromRefreshToken(accessTokenRequest);
//        System.out.println(accessToken);


        //user

////
//        UserAPI userAPI = new UserAPI(credentials);
//
//        GetUserRequest getUserRequest = new GetUserRequest();
//        GetUserResponse getUserResponse = userAPI.getUser(getUserRequest);
//        System.out.println("getUserResponse : "+getUserResponse);
//

// item
//
//        ItemAPI itemAPI = new ItemAPI(credentials);
//        GetItemRequest getItemRequest = new GetItemRequest("110553191196");
//        GetItemResponse item = itemAPI.getItem(getItemRequest);
//
//        System.out.println("item" + item);

//
        SellerAPI sellerAPI = new SellerAPI(credentials);
        GetSellerListRequest getSellerListRequest = new GetSellerListRequest();
//        getSellerListRequest.setEndTimeFrom();
//        getSellerListRequest.setEndTimeTo();
        getSellerListRequest.setStartTimeFrom("2023-01-01T06:29:22.000Z");
        getSellerListRequest.setStartTimeTo("2023-03-30T06:29:22.000Z");
//        getSellerListRequest.setGranularityLevel("Fine");
        System.out.println("GranularityLevelCodeType: "+GranularityLevelCodeType.Fine);
        getSellerListRequest.setGranularityLevel(GranularityLevelCodeType.Fine);
        Pagination pagination = new Pagination();
//        pagination.setPageNumber(1);
        pagination.setEntriesPerPage(200);
        getSellerListRequest.setPagination(pagination);
        getSellerListRequest.setIncludeVariations(true);
        GetSellerListResponse items = sellerAPI.getItems(getSellerListRequest);
        System.out.println("getsellerlistrequest : "+items);


// item end


//        System.out.println("request credentials"+credentials);


//        System.out.println(item);

//        ItemAPI itemName =new ItemAPI(credentials);
//        var items= itemName.addFixedPriceItem(new AddFixedPriceItemRequest());

//        System.out.println(items);

//        ItemAPI itemName =new ItemAPI(credentials);
//        var items= itemName.getItem(new GetItemRequest("110553222169"));

//        System.out.println(items);


        // TRANSACTION ITEM ORDER AND SELLER IN ORDER CHECK

//        OrderAPI itOrderAPI = new OrderAPI(credentials);
//
//
//        GetItemTransactionsRequest getItemTransactionsRequest = new GetItemTransactionsRequest();
//        getItemTransactionsRequest.setItemID("110553191196");
////        getItemTransactionsRequest.setItemID("110553191196");
////        getItemTransactionsRequest.setItemID("110553222169");
////        getItemTransactionsRequest.setItemID("110553234084");
////        getItemTransactionsRequest.setItemID("110553234087");
////        getItemTransactionsRequest.setItemID("110553234122");
//        getItemTransactionsRequest.setNumberOfDays("10");
//        getItemTransactionsRequest.setDetailLevel("ReturnAll");
//        GetItemTransactionsResponse getItemTransactionsResponse = itOrderAPI.GetItemTransactions(getItemTransactionsRequest);
//        System.out.println("getItemTransactionsResponse : " + getItemTransactionsResponse);


//
//        GetOrderTransactionsRequest getOrderTransactionsRequest = new GetOrderTransactionsRequest();
//        getOrderTransactionsRequest.setDetailLevel(DETAIL_LEVEL_RETURN_ALL);
//        getOrderTransactionsRequest.setIncludeFinalValueFees(true);
//        OrderIDArray orderIDArray = new OrderIDArray();
//        List<String> orderList = new ArrayList<>(Arrays.asList("04-09573-55430","18-09599-91996"));
//        orderIDArray.setOrderID(orderList);
//        getOrderTransactionsRequest.setOrderIDArray(orderIDArray);
//        GetOrderTransactionsResponse getOrderTransactionsResponse = itOrderAPI.GetOrderTransactions(getOrderTransactionsRequest);//
//        System.out.println("it order Array :" + orderIDArray);
//        System.out.println("getOrderTransactionsResponse : " + getOrderTransactionsResponse);


//

////
//        GetOrdersRequest getOrdersRequest = new GetOrdersRequest();
//        getOrdersRequest.setOrderStatus(OrderStatusCodeType.ALL);
////        getOrdersRequest.setCreateTimeFrom("");
//        getOrdersRequest.setNumberOfDays(10);
//
//////        getOrdersRequest.getCreateTimeTo("");
//        GetOrdersResponse orders = itOrderAPI.getOrders(getOrdersRequest);
////
//        System.out.println("get order : "+orders);

//
    }
//    public String buildAuthorization(String atr1,String atr2) {
//        byte[] encodeBytes = Base64.getEncoder().encode((atr1 + ":" + atr2).getBytes());
//        return "Basic " + new String(encodeBytes);
//    }

}
