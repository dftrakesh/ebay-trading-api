package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.order.transactions.*;
import io.github.dft.ebay.model.order.transactions.tax.Taxes;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "Order")
public class Order implements Serializable {

    @JacksonXmlProperty(localName = "OrderID")
    private String orderID;

    @JacksonXmlProperty(localName = "AdjustmentAmount")
    public AdjustmentAmount adjustmentAmount;

    @JacksonXmlProperty(localName = "AmountPaid")
    public AmountPaid amountPaid;

    @JacksonXmlProperty(localName = "AmountSaved")
    public AmountSaved amountSaved;

    @JacksonXmlProperty(localName = "CheckoutStatus")
    public CheckoutStatus checkoutStatus;

    @JacksonXmlProperty(localName = "ShippingDetails")
    public ShippingDetails shippingDetails;

    @JacksonXmlProperty(localName = "ShippingServiceSelected")
    public ShippingServiceSelected shippingServiceSelected;

    @JacksonXmlProperty(localName = "Subtotal")
    public Subtotal subtotal;

    @JacksonXmlProperty(localName = "ExternalTransaction")
    public ExternalTransaction externalTransaction;

    @JacksonXmlProperty(localName = "BuyerUserID")
    public String buyerUserID;

    @JacksonXmlProperty(localName = "PaidTime")
    public String paidTime;

    @JacksonXmlProperty(localName = "ShippedTime")
    public String shippedTime;

    @JacksonXmlProperty(localName = "IntegratedMerchantCreditCardEnabled")
    public boolean integratedMerchantCreditCardEnabled;

    @JacksonXmlProperty(localName = "PaymentHoldStatus")
    public String paymentHoldStatus;

    @JacksonXmlProperty(localName = "IsMultiLegShipping")
    public boolean isMultiLegShipping;

    @JacksonXmlProperty(localName = "MonetaryDetails")
    public MonetaryDetails monetaryDetails;

    @JacksonXmlProperty(localName = "SellerUserID")
    public String sellerUserID;

    @JacksonXmlProperty(localName = "sellerEIASToken")
    public String sellerEIASToken;

    @JacksonXmlProperty(localName = "CancelStatus")
    public String cancelStatus;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    public String extendedOrderID;

    @JacksonXmlProperty(localName = "ContainseBayPlusTransaction")
    public boolean containseBayPlusTransaction;

    @JacksonXmlProperty(localName = "OrderStatus")
    private String orderStatus;

    @JacksonXmlProperty(localName = "CreatedTime")
    private String createdTime;

    @JacksonXmlProperty(localName = "Total")
    private Double total;

    @JacksonXmlProperty(localName = "Item")
    private Item item;

    @JacksonXmlProperty(localName = "TransactionArray")
    private OrderTransactionArray orderTransactionArray;

    @JacksonXmlProperty(localName = "ShippingAddress")
    private ShippingAddress shippingAddress;
}