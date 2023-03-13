package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.order.transactions.*;
import io.github.dft.ebay.model.order.transactions.tax.Taxes;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Transaction")
public class OrderTransaction {

    @JacksonXmlProperty(localName = "CreatedDate")
    public String createdDate;

    @JacksonXmlProperty(localName = "DepositType")
    public String depositType;

    @JacksonXmlProperty(localName = "QuantityPurchased")
    public Integer quantityPurchased;

    @JacksonXmlProperty(localName = "Item")
    public Item item;

    @JacksonXmlProperty(localName = "TransactionID")
    public String transactionID;

    @JacksonXmlProperty(localName = "BestOfferSale")
    public boolean bestOfferSale;

    @JacksonXmlProperty(localName = "PaidTime")
    public String paidTime;

    @JacksonXmlProperty(localName = "ShippedTime")
    public String shippedTime;

    @JacksonXmlProperty(localName = "TransactionSiteID")
    public String transactionSiteID;

    @JacksonXmlProperty(localName = "Platform")
    public String platform;

    @JacksonXmlProperty(localName = "OrderLineItemID")
    public String orderLineItemID;

    @JacksonXmlProperty(localName = "IsMultiLegShipping")
    public boolean isMultiLegShipping;

    @JacksonXmlProperty(localName = "IntangibleItem")
    public boolean intangibleItem;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    public String extendedOrderID;

    @JacksonXmlProperty(localName = "eBayPlusTransaction")
    public boolean eBayPlusTransaction;

    @JacksonXmlProperty(localName = "AmountPaid")
    public String amountPaid;

    @JacksonXmlProperty(localName = "AdjustmentAmount")
    public String adjustmentAmount;

    @JacksonXmlProperty(localName = "ConvertedAmountPaid")
    public String convertedAmountPaid;

    @JacksonXmlProperty(localName = "ConvertedAdjustmentAmount")
    public String convertedAdjustmentAmount;

    @JacksonXmlProperty(localName = "ConvertedTransactionPrice")
    public String convertedTransactionPrice;

    @JacksonXmlProperty(localName = "TransactionPrice")
    public String transactionPrice;

    @JacksonXmlProperty(localName = "BuyerGuaranteePrice")
    public String buyerGuaranteePrice;

    @JacksonXmlProperty(localName = "ActualShippingCost")
    public String actualShippingCost;

    @JacksonXmlProperty(localName = "ActualHandlingCost")
    public String actualHandlingCost;

    @JacksonXmlProperty(localName = "Buyer")
    public Buyer buyer;

    @JacksonXmlProperty(localName = "ShippingDetails")
    public ShippingDetails shippingDetails;

    @JacksonXmlProperty(localName = "Status")
    public TransactionStatus transactionStatus;

    @JacksonXmlProperty(localName = "ExternalTransaction")
    public ExternalTransaction externalTransaction;

    @JacksonXmlProperty(localName = "ShippingServiceSelected")
    public ShippingServiceSelected shippingServiceSelected;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTaxes")
    public Taxes taxes;

    @JacksonXmlProperty(localName = "MonetaryDetails")
    public MonetaryDetails monetaryDetails;

    @JacksonXmlProperty(localName = "Variation")
    private Variation variation;
}