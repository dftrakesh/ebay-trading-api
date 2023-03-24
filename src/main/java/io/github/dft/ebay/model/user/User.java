package io.github.dft.ebay.model.user;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "User")
public class User {

    @JacksonXmlProperty(localName = "RegistrationDate")
    private String registrationDate;

    @JacksonXmlProperty(localName = "AboutMePage")
    private String aboutMePage;

    @JacksonXmlProperty(localName = "BillingEmail")
    private String billingEmail;

    @JacksonXmlProperty(localName = "BusinessRole")
    private String businessRole;

    @JacksonXmlProperty(localName = "eBayGoodStanding")
    private String eBayGoodStanding;

    @JacksonXmlProperty(localName = "eBayWikiReadOnly")
    private String eBayWikiReadOnly;

    @JacksonXmlProperty(localName = "EIASToken")
    private String eiasToken;

    @JacksonXmlProperty(localName = "Email")
    private String email;

    @JacksonXmlProperty(localName = "EnterpriseSeller")
    private String enterpriseSeller;

    @JacksonXmlProperty(localName = "FeedbackPrivate")
    private String feedbackPrivate;

    @JacksonXmlProperty(localName = "FeedbackRatingStar")
    private String feedbackRatingStar;

    @JacksonXmlProperty(localName = "FeedbackScore")
    private String feedbackScore;

    @JacksonXmlProperty(localName = "IDVerified")
    private String idVerified;

    @JacksonXmlProperty(localName = "NewUser")
    private String newUser;

    @JacksonXmlProperty(localName = "PayPalAccountLevel")
    private String payPalAccountLevel;

    @JacksonXmlProperty(localName = "PayPalAccountStatus")
    private String payPalAccountStatus;

    @JacksonXmlProperty(localName = "PayPalAccountType")
    private String payPalAccountType;

    @JacksonXmlProperty(localName = "PositiveFeedbackPercent")
    private String positiveFeedbackPercent;

    @JacksonXmlProperty(localName = "QualifiesForSelling")
    private String qualifiesForSelling;

    @JacksonXmlProperty(localName = "RegistrationAddress")
    private RegistrationAddress registrationAddress;

    @JacksonXmlProperty(localName = "SellerInfo")
    private SellerInfo sellerInfo;

    @JacksonXmlProperty(localName = "Site")
    private String site;

    @JacksonXmlProperty(localName = "Status")
    private String status;

    @JacksonXmlProperty(localName = "RegistrationDateTUVLevel")
    private String tuvLevel;

    @JacksonXmlProperty(localName = "UniqueNegativeFeedbackCount")
    private String uniqueNegativeFeedbackCount;

    @JacksonXmlProperty(localName = "UniqueNeutralFeedbackCount")
    private String uniqueNeutralFeedbackCount;

    @JacksonXmlProperty(localName = "UniquePositiveFeedbackCount")
    private String uniquePositiveFeedbackCount;

    @JacksonXmlProperty(localName = "UserID")
    private String userID;

    @JacksonXmlProperty(localName = "UserIDChanged")
    private String userIDChanged;

    @JacksonXmlProperty(localName = "UserIDLastChanged")
    private String userIDLastChanged;

    @JacksonXmlProperty(localName = "UserSubscription")
    private String userSubscription;

    @JacksonXmlProperty(localName = "VATID")
    private String vatID;

    @JacksonXmlProperty(localName = "VATStatus")
    private String vatStatus;
}
