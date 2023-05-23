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
    private Buyer buyer;

    @JacksonXmlProperty(localName = "BestOfferSale")
    private String bestOfferSale;

    @JacksonXmlProperty(localName = "BuyerGuaranteePrice")
    private String buyerGuaranteePrice;

    @JacksonXmlProperty(localName = "BuyerPackageEnclosures")
    private BuyerPackageEnclosures buyerPackageEnclosures;

    @JacksonXmlProperty(localName = "ActualHandlingCost")
    private String actualHandlingCost;

    @JacksonXmlProperty(localName = "ActualShippingCost")
    private String actualShippingCost;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    private String ExtendedOrderID;

    @JacksonXmlProperty(localName = "ConvertedAdjustmentAmount")
    private String convertedAdjustmentAmount;

    @JacksonXmlProperty(localName = "ConvertedAmountPaid")
    private String convertedAmountPaid;

    @JacksonXmlProperty(localName = "ConvertedTransactionPrice")
    private String convertedTransactionPrice;

    @JacksonXmlProperty(localName = "DepositType")
    private String depositType;

    @JacksonXmlProperty(localName = "CreatedDate")
    private String createdDate;

    @JacksonXmlProperty(localName = "DigitalDeliverySelected")
    private DigitalDeliverySelected digitalDeliverySelected;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTax")
    private Boolean eBayCollectAndRemitTax;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTaxes")
    private EBayCollectAndRemitTaxes eBayCollectAndRemitTaxes;

    @JacksonXmlProperty(localName = "eBayPaymentID")
    private String eBayPaymentID;

    @JacksonXmlProperty(localName = "eBayPlusTransaction")
    private String eBayPlusTransaction;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    private String extendedOrderID;

    @JacksonXmlProperty(localName = "ExternalTransaction")
    private ExternalTransaction externalTransaction;

    @JacksonXmlProperty(localName = "FinalValueFee")
    private String finalValueFee;

    @JacksonXmlProperty(localName = "Gift")
    private String gift;

    @JacksonXmlProperty(localName = "GiftSummary")
    private String giftSummary;

    @JacksonXmlProperty(localName = "GuaranteedDelivery")
    private String guaranteedDelivery;

    @JacksonXmlProperty(localName = "GuaranteedShipping")
    private String guaranteedShipping;

    @JacksonXmlProperty(localName = "IntangibleItem")
    private String intangibleItem;

    @JacksonXmlProperty(localName = "InventoryReservationID")
    private String inventoryReservationID;

    @JacksonXmlProperty(localName = "InvoicesSentTime")
    private String invoiceSentTime;

    @JacksonXmlProperty(localName = "LogisticsPlanType")
    private String logisticsPlanType;

    @JacksonXmlProperty(localName = "IsMultiLegShipping")
    private String isMultiLegShipping;

    @JacksonXmlProperty(localName = "OrderLineItemID")
    private String orderLineItemID;

    @JacksonXmlProperty(localName = "PaidTime")
    private String paidTime;

    @JacksonXmlProperty(localName = "Program")
    private Program program;

    @JacksonXmlProperty(localName = "SellerDiscounts")
    private SellerDiscounts sellerDiscounts;

    @JacksonXmlProperty(localName = "ShippedTime")
    private String shippedTime;

    @JacksonXmlProperty(localName = "Status")
    private Status status;

    @JacksonXmlProperty(localName = "TransactionSiteID")
    private String transactionSiteID;

    @JacksonXmlProperty(localName = "Item")
    private Item item;

    @JacksonXmlProperty(localName = "Variation")
    private Variation variation;
}