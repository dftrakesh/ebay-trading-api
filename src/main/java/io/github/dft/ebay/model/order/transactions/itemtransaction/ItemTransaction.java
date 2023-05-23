package io.github.dft.ebay.model.order.transactions.itemtransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import io.github.dft.ebay.model.order.*;
import io.github.dft.ebay.model.order.transactions.Buyer;
import io.github.dft.ebay.model.order.transactions.ExternalTransaction;
import io.github.dft.ebay.model.order.transactions.MonetaryDetails;
import io.github.dft.ebay.model.order.transactions.TransactionStatus;
import io.github.dft.ebay.model.order.transactions.tax.EBayCollectAndRemitTaxes;
import lombok.Data;

import java.io.Serializable;

@Data
@JacksonXmlRootElement(localName = "Transaction")
public class ItemTransaction implements Serializable {


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

    @JacksonXmlProperty(localName = "AdjustmentAmount")
    private String adjustmentAmount;

    @JacksonXmlProperty(localName = "AmountPaid")
    private String amountPaid;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    private String extendedOrderID;

    @JacksonXmlProperty(localName = "BuyerCheckoutMessage")
    private String buyerCheckoutMessage;

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

    @JacksonXmlProperty(localName = "eBayPlusTransaction")
    private String eBayPlusTransaction;

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

    @JacksonXmlProperty(localName = "MonetaryDetails")
    private MonetaryDetails monetaryDetails;

    @JacksonXmlProperty(localName = "MultiLegShippingDetails")
    private MultiLegShippingDetails multiLegShippingDetails;

    @JacksonXmlProperty(localName = "PaymentHoldDetails")
    private PaymentHoldDetails paymentHoldDetails;

    @JacksonXmlProperty(localName = "PayPalEmailAddress")
    private String payPalEmailAddress;

    @JacksonXmlProperty(localName = "PickupDetails")
    private PickupDetails pickupDetails;

    @JacksonXmlProperty(localName = "PickupMethodSelected")
    private PickupMethodSelected pickupMethodSelected;

    @JacksonXmlProperty(localName = "Platform")
    private String platform;

    @JacksonXmlProperty(localName = "SellingManagerProductDetails")
    private String sellingManagerProductDetails;

    @JacksonXmlProperty(localName = "ShippingDetails")
    private ShippingDetails shippingDetails;

    @JacksonXmlProperty(localName = "ShippingServiceSelected")
    private ShippingServiceSelected shippingServiceSelected;

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
    private TransactionStatus transactionStatus;

    @JacksonXmlProperty(localName = "TransactionSiteID")
    private String transactionSiteID;

    @JacksonXmlProperty(localName = "Variation")
    private Variation variation;
}