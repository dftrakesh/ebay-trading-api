package io.github.dft.ebay.model.order.transactions.ordertransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.*;
import io.github.dft.ebay.model.order.transactions.ExternalTransaction;
import io.github.dft.ebay.model.order.transactions.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Order {

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

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    public String extendedOrderID;

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

    @JacksonXmlProperty(localName = "ExternalTransaction")
    private ExternalTransaction externalTransaction;

    @JacksonXmlProperty(localName = "TransactionArray")
    private OrderTransactionArray orderTransactionArray;
}
