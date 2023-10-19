package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.transactions.tax.EBayCollectAndRemitTaxes;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transaction implements Serializable {

    @JacksonXmlProperty(localName = "TransactionID")
    private String transactionID;

    @JacksonXmlProperty(localName = "TransactionPrice")
    private Double transactionPrice;

    @JacksonXmlProperty(localName = "QuantityPurchased")
    private Integer quantityPurchased;

    @JacksonXmlProperty(localName = "Buyer")
    private Buyer buyer;

    @JacksonXmlProperty(localName = "ActualHandlingCost")
    private String actualHandlingCost;

    @JacksonXmlProperty(localName = "ActualShippingCost")
    private String actualShippingCost;

    @JacksonXmlProperty(localName = "CreatedDate")
    private String createdDate;

    @JacksonXmlProperty(localName = "DigitalDeliverySelected")
    private DigitalDeliverySelected digitalDeliverySelected;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTaxes")
    private EBayCollectAndRemitTaxes eBayCollectAndRemitTaxes;

    @JacksonXmlProperty(localName = "eBayPlusTransaction")
    private String eBayPlusTransaction;

    @JacksonXmlProperty(localName = "ExtendedOrderID")
    private String extendedOrderID;

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

    @JacksonXmlProperty(localName = "InventoryReservationID")
    private String inventoryReservationID;

    @JacksonXmlProperty(localName = "InvoiceSentTime")
    private String invoiceSentTime;

    @JacksonXmlProperty(localName = "LogisticsPlanType")
    private String logisticsPlanType;

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
