package io.github.dft.ebay.model.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "SellerInfo")
public class SellerInfo {


    @JacksonXmlProperty(localName = "AllowPaymentEdit")
    private String allowPaymentEdit;

    @JacksonXmlProperty(localName = "CharityRegistered")
    private String charityRegistered;

    @JacksonXmlProperty(localName = "CheckoutEnabled")
    private String checkoutEnabled;

    @JacksonXmlProperty(localName = "CIPBankAccountStored")
    private String cipBankAccountStored;

    @JacksonXmlProperty(localName = "DomesticRateTable")
    private String domesticRateTable;

    @JacksonXmlProperty(localName = "GoodStanding")
    private String goodStanding;

    @JacksonXmlProperty(localName = "InternationalRateTable")
    private String internationalRateTable;

    @JacksonXmlProperty(localName = "PaisaPayEscrowEMIStatus")
    private String paisaPayEscrowEMIStatus;

    @JacksonXmlProperty(localName = "PaymentMethod")
    private String paymentMethod;

    @JacksonXmlProperty(localName = "QualifiesForB2BVAT")
    private String qualifiesForB2BVAT;

    @JacksonXmlProperty(localName = "RegisteredBusinessSeller")
    private String registeredBusinessSeller;

    @JacksonXmlProperty(localName = "SafePaymentExempt")
    private String safePaymentExempt;

    @JacksonXmlProperty(localName = "SellerBusinessType")
    private String sellerBusinessType;

    @JacksonXmlProperty(localName = "SellerLevel")
    private String sellerLevel;

    @JacksonXmlProperty(localName = "StoreOwner")
    private String storeOwner;

    @JacksonXmlProperty(localName = "StoreSite")
    private String storeSite;

    @JacksonXmlProperty(localName = "StoreURL")
    private String storeURL;

    @JacksonXmlProperty(localName = "TopRatedSeller")
    private String topRatedSeller;

    @JacksonXmlProperty(localName = "TransactionPercent")
    private String transactionPercent;
}
