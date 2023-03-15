package io.github.dft.ebay.model.order;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.transactions.tax.EBayCollectAndRemitTaxes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Transaction implements Serializable {

    @JacksonXmlProperty(localName = "TransactionID")
    private String transactionID;

    @JacksonXmlProperty(localName = "TransactionPrice")
    private Double transactionPrice;

    @JacksonXmlProperty(localName = "QuantityPurchased")
    private Integer quantityPurchased;

    @JacksonXmlProperty(localName = "Buyer")
    public Buyer buyer;

    @JacksonXmlProperty(localName = "ActualHandlingCost")
    public String actualHandlingCost;

    @JacksonXmlProperty(localName = "ActualShippingCost")
    public String actualShippingCost;

    @JacksonXmlProperty(localName = "CreatedDate")
    public String createdDate;

    @JacksonXmlProperty(localName = "DigitalDeliverySelected")
    public DigitalDeliverySelected digitalDeliverySelected;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTaxes")
    public EBayCollectAndRemitTaxes eBayCollectAndRemitTaxes;

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

    @JacksonXmlProperty(localName = "InventoryReservationID")
    public String inventoryReservationID;

    @JacksonXmlProperty(localName = "InvoiceSentTime")
    public String invoiceSentTime;

    @JacksonXmlProperty(localName = "LogisticsPlanType")
    public String logisticsPlanType;

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
