package io.github.dft.ebay.model.order.transactions.ordertransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.order.*;
import io.github.dft.ebay.model.order.transactions.Buyer;
import io.github.dft.ebay.model.order.transactions.tax.EBayCollectAndRemitTaxes;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "Transaction")
public class OrderTransaction {

    @JacksonXmlProperty(localName = "TransactionID")
    private String transactionID;

    @JacksonXmlProperty(localName = "TransactionPrice")
    private Double transactionPrice;

    @JacksonXmlProperty(localName = "QuantityPurchased")
    private Integer quantityPurchased;

    @JacksonXmlProperty(localName = "Buyer")
    public Buyer buyer;

    @JacksonXmlProperty(localName = "BestOfferSale")
    public String bestOfferSale;

    @JacksonXmlProperty(localName = "BuyerGuaranteePrice")
    public String buyerGuaranteePrice;

    @JacksonXmlProperty(localName = "BuyerPackageEnclosures")
    public BuyerPackageEnclosures buyerPackageEnclosures;

    @JacksonXmlProperty(localName = "ActualHandlingCost")
    public String actualHandlingCost;

    @JacksonXmlProperty(localName = "ActualShippingCost")
    public String actualShippingCost;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    public String ExtendedOrderID;

    @JacksonXmlProperty(localName = "ConvertedAdjustmentAmount")
    public String convertedAdjustmentAmount;

    @JacksonXmlProperty(localName = "ConvertedAmountPaid")
    public String convertedAmountPaid;

    @JacksonXmlProperty(localName = "ConvertedTransactionPrice")
    public String convertedTransactionPrice;

    @JacksonXmlProperty(localName = "DepositType")
    public String depositType;

    @JacksonXmlProperty(localName = "CreatedDate")
    public String createdDate;

    @JacksonXmlProperty(localName = "DigitalDeliverySelected")
    public DigitalDeliverySelected digitalDeliverySelected;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTax")
    public boolean eBayCollectAndRemitTax;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTaxes")
    public EBayCollectAndRemitTaxes eBayCollectAndRemitTaxes;

    @JacksonXmlProperty(localName = "eBayPaymentID")
    public String eBayPaymentID;

    @JacksonXmlProperty(localName = "eBayPlusTransaction")
    public String eBayPlusTransaction;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    public String extendedOrderID;

    @JacksonXmlProperty(localName = "ExternalTransaction")
    public ExternalTransaction externalTransaction;

    @JacksonXmlProperty(localName = "FinalValueFee")
    public String finalValueFee;

    @JacksonXmlProperty(localName = "Gift")
    public String gift;

    @JacksonXmlProperty(localName = "GiftSummary")
    public String giftSummary;

    @JacksonXmlProperty(localName = "GuaranteedDelivery")
    public String guaranteedDelivery;

    @JacksonXmlProperty(localName = "GuaranteedShipping")
    public String guaranteedShipping;

    @JacksonXmlProperty(localName = "IntangibleItem")
    public String intangibleItem;

    @JacksonXmlProperty(localName = "InventoryReservationID")
    public String inventoryReservationID;

    @JacksonXmlProperty(localName = "InvoicesSentTime")
    public String invoiceSentTime;

    @JacksonXmlProperty(localName = "LogisticsPlanType")
    public String logisticsPlanType;

    @JacksonXmlProperty(localName = "IsMultiLegShipping")
    public String isMultiLegShipping;

    @JacksonXmlProperty(localName = "OrderLineItemID")
    public String orderLineItemID;

    @JacksonXmlProperty(localName = "PaidTime")
    public String paidTime;

    @JacksonXmlProperty(localName = "Program")
    public Program program;

    @JacksonXmlProperty(localName = "SellerDiscounts")
    public SellerDiscounts sellerDiscounts;

    @JacksonXmlProperty(localName = "ShippedTime")
    public String shippedTime;

    @JacksonXmlProperty(localName = "Status")
    public Status status;

    @JacksonXmlProperty(localName = "TransactionSiteID")
    public String transactionSiteID;

    @JacksonXmlProperty(localName = "Item")
    private Item item;

    @JacksonXmlProperty(localName = "Variation")
    private Variation variation;
}