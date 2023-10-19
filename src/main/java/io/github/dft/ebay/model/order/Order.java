package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.order.transactions.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Order")
public class Order implements Serializable {

    @JacksonXmlProperty(localName = "OrderID")
    private String orderID;

    @JacksonXmlProperty(localName = "AdjustmentAmount")
    private String adjustmentAmount;

    @JacksonXmlProperty(localName = "AmountPaid")
    private AmountPaid amountPaid;

    @JacksonXmlProperty(localName = "AmountSaved")
    private String amountSaved;

    @JacksonXmlProperty(localName = "BuyerUserID")
    private String buyerUserID;

    @JacksonXmlProperty(localName = "BuyerCheckoutMessage")
    private String buyerCheckoutMessage;

    @JacksonXmlProperty(localName = "BuyerPackageEnclosures")
    private BuyerPackageEnclosures buyerPackageEnclosures;

    @JacksonXmlProperty(localName = "BuyerTaxIdentifier")
    private BuyerTaxIdentifier buyerTaxIdentifier;

    @JacksonXmlProperty(localName = "CancelStatus")
    private String cancelStatus;

    @JacksonXmlProperty(localName = "CancelReason")
    private String cancelReason;

    @JacksonXmlProperty(localName = "CheckoutStatus")
    private CheckoutStatus checkoutStatus;

    @JacksonXmlProperty(localName = "ContainseBayPlusTransaction")
    private Boolean containseBayPlusTransaction;

    @JacksonXmlProperty(localName = "CreatingUserRole")
    private String creatingUserRole;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTax")
    private Boolean eBayCollectAndRemitTax;

    @JacksonXmlProperty(localName = "CreatedTime")
    private String createdTime;

    @JacksonXmlProperty(localName = "EIASToken")
    private String eiasToken;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    private String extendedOrderID;

    @JacksonXmlProperty(localName = "ExternalTransaction")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ExternalTransaction> externalTransaction;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    private Boolean integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "MonetaryDetails")
    private MonetaryDetails monetaryDetails;

    @JacksonXmlProperty(localName = "IsMultiLegShipping")
    private Boolean isMultiLegShipping;

    @JacksonXmlProperty(localName = "OrderStatus")
    private String orderStatus;

    @JacksonXmlProperty(localName = "PaidTime")
    private String paidTime;

    @JacksonXmlProperty(localName = "MultiLegShippingDetails")
    private MultiLegShippingDetails multiLegShippingDetails;

    @JacksonXmlProperty(localName = "PaymentHoldDetails")
    private PaymentHoldDetails paymentHoldDetails;

    @JacksonXmlProperty(localName = "PickupDetails")
    private PickupDetails pickupDetails;

    @JacksonXmlProperty(localName = "PickupMethodSelected")
    private PickupMethodSelected pickupMethodSelected;

    @JacksonXmlProperty(localName = "PaymentMethods")
    private String paymentMethods;

    @JacksonXmlProperty(localName = "LogisticsPlanType")
    private String logisticsPlanType;

    @JacksonXmlProperty(localName = "PaymentHoldStatus")
    private String paymentHoldStatus;

    @JacksonXmlProperty(localName = "SellerUserID")
    private String sellerUserID;

    @JacksonXmlProperty(localName = "sellerEIASToken")
    private String sellerEIASToken;

    @JacksonXmlProperty(localName = "SellerEmail")
    private String sellerEmail;

    @JacksonXmlProperty(localName = "ShippedTime")
    private String shippedTime;

    @JacksonXmlProperty(localName = "ShippingAddress")
    private ShippingAddress shippingAddress;

    @JacksonXmlProperty(localName = "ShippingDetails")
    private ShippingDetails shippingDetails;

    @JacksonXmlProperty(localName = "ShippingServiceSelected")
    private ShippingServiceSelected shippingServiceSelected;

    @JacksonXmlProperty(localName = "Subtotal")
    private String subtotal;

    @JacksonXmlProperty(localName = "Total")
    private Double total;

    @JacksonXmlProperty(localName = "TransactionArray")
    private TransactionArray transactionArray;
}