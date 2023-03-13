package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.transactions.tax.TaxTable;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingDetails implements Serializable {

    @JacksonXmlProperty(localName = "CalculatedShippingRate")
    public CalculatedShippingRate calculatedShippingRate;

    @JacksonXmlProperty(localName = "ChangePaymentInstructions")
    public boolean changePaymentInstructions;

    @JacksonXmlProperty(localName = "TaxTable")
    public TaxTable taxTable;

    @JacksonXmlProperty(localName = "PaymentEdited")
    public boolean paymentEdited;

    @JacksonXmlProperty(localName = "ShippingServiceOptions")
    public ShippingServiceOptions shippingServiceOptions;

    @JacksonXmlProperty(localName = "ShippingType")
    public String shippingType;

    @JacksonXmlProperty(localName = "SellingManagerSalesRecordNumber")
    public Integer sellingManagerSalesRecordNumber;

    @JacksonXmlProperty(localName = "ThirdPartyCheckout")
    public boolean thirdPartyCheckout;

    @JacksonXmlProperty(localName = "GetItFast")
    public boolean getItFast;

    @JacksonXmlProperty(localName = "ShippingServiceUsed")
    public String shippingServiceUsed;

    @JacksonXmlProperty(localName = "ShipmentTrackingDetails")
    public ShipmentTrackingDetails shipmentTrackingDetails;
}