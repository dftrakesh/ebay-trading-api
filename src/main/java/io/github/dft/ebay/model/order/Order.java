package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.order.transactions.CheckoutStatus;
import io.github.dft.ebay.model.order.transactions.MonetaryDetails;
import io.github.dft.ebay.model.order.transactions.ShippingDetails;
import io.github.dft.ebay.model.order.transactions.ShippingServiceSelected;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "Order")
public class Order implements Serializable {

    @JacksonXmlProperty(localName = "OrderID")
    private String orderID;

    @JacksonXmlProperty(localName = "AdjustmentAmount")
    public String adjustmentAmount;

    @JacksonXmlProperty(localName = "AmountPaid")
    public String amountPaid;

    @JacksonXmlProperty(localName = "AmountSaved")
    public String amountSaved;

    @JacksonXmlProperty(localName = "BuyerUserID")
    public String buyerUserID;

    @JacksonXmlProperty(localName = "BuyerCheckoutMessage")
    public String buyerCheckoutMessage;

    @JacksonXmlProperty(localName = "BuyerPackageEnclosures")
    public BuyerPackageEnclosures buyerPackageEnclosures;

    @JacksonXmlProperty(localName = "BuyerTaxIdentifier")
    public BuyerTaxIdentifier buyerTaxIdentifier;

    @JacksonXmlProperty(localName = "CancelStatus")
    public String cancelStatus;

    @JacksonXmlProperty(localName = "CancelReason")
    public String cancelReason;

    @JacksonXmlProperty(localName = "CheckoutStatus")
    public CheckoutStatus checkoutStatus;

    @JacksonXmlProperty(localName = "ContainseBayPlusTransaction")
    public boolean containseBayPlusTransaction;

    @JacksonXmlProperty(localName = "CreatingUserRole")
    public String creatingUserRole;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTax")
    public boolean eBayCollectAndRemitTax;

    @JacksonXmlProperty(localName = "CreatedTime")
    private String createdTime;

    @JacksonXmlProperty(localName = "EIASToken")
    public String eiasToken;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    public String extendedOrderID;

    @JacksonXmlProperty(localName = "ExternalTransaction")
    public ExternalTransaction externalTransaction;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    public boolean integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "MonetaryDetails")
    public MonetaryDetails monetaryDetails;

    @JacksonXmlProperty(localName = "IsMultiLegShipping")
    public boolean isMultiLegShipping;

    @JacksonXmlProperty(localName = "OrderStatus")
    private String orderStatus;

    @JacksonXmlProperty(localName = "PaidTime")
    public String paidTime;

    @JacksonXmlProperty(localName = "MultiLegShippingDetails")
    public MultiLegShippingDetails multiLegShippingDetails;

    @JacksonXmlProperty(localName = "PaymentHoldDetails")
    public PaymentHoldDetails paymentHoldDetails;

    @JacksonXmlProperty(localName = "PickupDetails")
    public PickupDetails pickupDetails;

    @JacksonXmlProperty(localName = "PickupMethodSelected")
    public PickupMethodSelected pickupMethodSelected;

    @JacksonXmlProperty(localName = "PaymentMethods")
    public String paymentMethods;

    @JacksonXmlProperty(localName = "LogisticsPlanType")
    public String logisticsPlanType;

    @JacksonXmlProperty(localName = "PaymentHoldStatus")
    public String paymentHoldStatus;

    @JacksonXmlProperty(localName = "SellerUserID")
    public String sellerUserID;

    @JacksonXmlProperty(localName = "sellerEIASToken")
    public String sellerEIASToken;

    @JacksonXmlProperty(localName = "SellerEmail")
    public String sellerEmail;

    @JacksonXmlProperty(localName = "ShippedTime")
    public String shippedTime;

    @JacksonXmlProperty(localName = "ShippingAddress")
    private ShippingAddress shippingAddress;

    @JacksonXmlProperty(localName = "ShippingDetails")
    public ShippingDetails shippingDetails;

    @JacksonXmlProperty(localName = "ShippingServiceSelected")
    public ShippingServiceSelected shippingServiceSelected;

    @JacksonXmlProperty(localName = "Subtotal")
    public String subtotal;

    @JacksonXmlProperty(localName = "Total")
    private Double total;

    @JacksonXmlProperty(localName = "TransactionArray")
    private TransactionArray transactionArray;
}