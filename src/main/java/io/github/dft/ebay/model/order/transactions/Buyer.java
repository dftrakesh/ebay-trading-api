package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Buyer implements Serializable {

    @JacksonXmlProperty(localName = "AboutMePage")
    private boolean aboutMePage;

    @JacksonXmlProperty(localName = "BuyerInfo")
    private BuyerInfo buyerInfo;

    @JacksonXmlProperty(localName = "EIASToken")
    private String eIASToken;

    @JacksonXmlProperty(localName = "Email")
    private String email;

    @JacksonXmlProperty(localName = "FeedbackScore")
    private Integer feedbackScore;

    @JacksonXmlProperty(localName = "PositiveFeedbackPercent")
    private double positiveFeedbackPercent;

    @JacksonXmlProperty(localName = "FeedbackPrivate")
    private boolean feedbackPrivate;

    @JacksonXmlProperty(localName = "IDVerified")
    private boolean iDVerified;

    @JacksonXmlProperty(localName = "eBayGoodStanding")
    private boolean eBayGoodStanding;

    @JacksonXmlProperty(localName = "NewUser")
    private boolean newUser;

    @JacksonXmlProperty(localName = "RegistrationDate")
    private String registrationDate;

    @JacksonXmlProperty(localName = "Site")
    private String site;

    @JacksonXmlProperty(localName = "Status")
    private String status;

    @JacksonXmlProperty(localName = "UserID")
    private String userID;

    @JacksonXmlProperty(localName = "UserIDChanged")
    private boolean userIDChanged;

    @JacksonXmlProperty(localName = "UserIDLastChanged")
    private String userIDLastChanged;

    @JacksonXmlProperty(localName = "VATStatus")
    private String vATStatus;

    @JacksonXmlProperty(localName = "StaticAlias")
    private String staticAlias;

    @JacksonXmlProperty(localName = "UserFirstName")
    private String userFirstName;

    @JacksonXmlProperty(localName = "UserLastName")
    private String userLastName;
}