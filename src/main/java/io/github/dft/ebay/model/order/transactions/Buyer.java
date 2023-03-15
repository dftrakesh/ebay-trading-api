package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Buyer implements Serializable {

    @JacksonXmlProperty(localName = "AboutMePage")
    public boolean aboutMePage;

    @JacksonXmlProperty(localName = "BuyerInfo")
    public BuyerInfo buyerInfo;

    @JacksonXmlProperty(localName = "EIASToken")
    public String eIASToken;

    @JacksonXmlProperty(localName = "Email")
    public String email;

    @JacksonXmlProperty(localName = "FeedbackScore")
    public Integer feedbackScore;

    @JacksonXmlProperty(localName = "PositiveFeedbackPercent")
    public double positiveFeedbackPercent;

    @JacksonXmlProperty(localName = "FeedbackPrivate")
    public boolean feedbackPrivate;

    @JacksonXmlProperty(localName = "IDVerified")
    public boolean iDVerified;

    @JacksonXmlProperty(localName = "eBayGoodStanding")
    public boolean eBayGoodStanding;

    @JacksonXmlProperty(localName = "NewUser")
    public boolean newUser;

    @JacksonXmlProperty(localName = "RegistrationDate")
    public String registrationDate;

    @JacksonXmlProperty(localName = "Site")
    public String site;

    @JacksonXmlProperty(localName = "Status")
    public String status;

    @JacksonXmlProperty(localName = "UserID")
    public String userID;

    @JacksonXmlProperty(localName = "UserIDChanged")
    public boolean userIDChanged;

    @JacksonXmlProperty(localName = "UserIDLastChanged")
    public String userIDLastChanged;

    @JacksonXmlProperty(localName = "VATStatus")
    public String vATStatus;

    @JacksonXmlProperty(localName = "StaticAlias")
    public String staticAlias;

    @JacksonXmlProperty(localName = "UserFirstName")
    public String userFirstName;

    @JacksonXmlProperty(localName = "UserLastName")
    public String userLastName;
}