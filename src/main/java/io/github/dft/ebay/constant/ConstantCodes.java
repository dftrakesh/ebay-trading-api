package io.github.dft.ebay.constant;

public interface ConstantCodes {
    String XML_API_PRODUCTION_GATEWAY = "https://api.ebay.com/ws/api.dll";

    String HTTP_HEADER_KEY_X_EBAY_API_IAF_TOKEN = "X-EBAY-API-IAF-TOKEN";
    String HTTP_HEADER_KEY_X_EBAY_API_COMPATIBILITY_LEVEL = "X-EBAY-API-COMPATIBILITY-LEVEL";
    String HTTP_HEADER_KEY_X_EBAY_API_DETAIL_LEVEL = "X-EBAY-API-DETAIL-LEVEL";
    String HTTP_HEADER_KEY_X_EBAY_API_DEV_NAME = "X-EBAY-API-DEV-NAME";
    String HTTP_HEADER_KEY_X_EBAY_API_APP_NAME = "X-EBAY-API-APP-NAME";
    String HTTP_HEADER_KEY_X_EBAY_API_CERT_NAME = "X-EBAY-API-CERT-NAME";
    String HTTP_HEADER_KEY_X_EBAY_API_CALL_NAME = "X-EBAY-API-CALL-NAME";
    String HTTP_HEADER_KEY_X_EBAY_API_SITEID = "X-EBAY-API-SITEID";
    String HTTP_HEADER_KEY_CONTENT_TYPE = "Content-Type";
    String HTTP_HEADER_CONTENT_TYPE_VALUE = "text/xml";

    String HTTP_HEADER_KEY_AUTHORIZATION = "Authorization";

    String HTTP_HEADER_CONTENT_TYPE_URLENCODED = "application/x-www-form-urlencoded";
    String HTTP_HEADER_X_EBAY_API_DETAIL_LEVEL_VALUE_RETURN_ALL = "0";
    String EBAY_API_CALL_NAME_FETCH_TOKEN = "FetchToken";

    String EBAY_API_CALL_NAME_GET_SELLER_LIST = "GetSellerList";
    String EBAY_API_CALL_NAME_GET_USER = "GetUser";
    String EBAY_API_CALL_NAME_GET_ITEM = "GetItem";

    String EBAY_API_CALL_NAME_GET_ORDERS = "GetOrders";
    String EBAY_API_CALL_NAME_SET_NOTIFICATION_PREFERENCES = "SetNotificationPreferences";

    String EBAY_API_CALL_NAME_REVISE_ITEM = "ReviseItem";

    String EBAY_API_CALL_NAME_REVISE_FIXED_PRICE_ITEM = "ReviseFixedPriceItem";
    String EBAY_PD_SCOPES = "https://api.ebay.com/oauth/api_scope https://api.ebay.com/oauth/api_scope/commerce.identity.readonly https://api.ebay.com/oauth/api_scope/sell.inventory https://api.ebay.com/oauth/api_scope/sell.account https://api.ebay.com/oauth/api_scope/sell.fulfillment ";
    String EBAY_AUTHORIZED_TOKEN_URL = "https://api.ebay.com/identity/v1/oauth2/token";
}