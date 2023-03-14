package io.github.dft.ebay.model.order.transactions.itemtransaction;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.InternationalShippingServiceOption;
import io.github.dft.ebay.model.order.SalesTax;
import io.github.dft.ebay.model.order.transactions.CalculatedShippingRate;
import io.github.dft.ebay.model.order.transactions.ShipmentTrackingDetails;
import io.github.dft.ebay.model.order.transactions.tax.TaxTable;
import lombok.Data;

@Data
public class ShippingDetails {

    @JacksonXmlProperty(localName = "ChangePaymentInstructions")
    public boolean changePaymentInstructions;

    @JacksonXmlProperty(localName = "ShippingServiceOptions")
    public ShippingServiceOptions shippingServiceOptions;

    @JacksonXmlProperty(localName = "ShippingType")
    public String shippingType;

    @JacksonXmlProperty(localName = "SellingManagerSalesRecordNumber")
    public String sellingManagerSalesRecordNumber;

    @JacksonXmlProperty(localName = "ShippingServiceUsed")
    public String shippingServiceUsed;

    @JacksonXmlProperty(localName = "CalculatedShippingRate")
    public CalculatedShippingRate calculatedShippingRate;

    @JacksonXmlProperty(localName = "CODCost")
    public String codCost;

    @JacksonXmlProperty(localName = "eBayEstimatedLabelCost")
    public String eBayEstimatedLabelCost;

    @JacksonXmlProperty(localName = "ExcludeShipToLocation")
    public String excludeShipToLocation;

    @JacksonXmlProperty(localName = "InternationalShippingServiceOption")
    public InternationalShippingServiceOption internationalShippingServiceOption;

    @JacksonXmlProperty(localName = "PaymentEdited")
    public String paymentEdited;

    @JacksonXmlProperty(localName = "SalesTax")
    public SalesTax salesTax;

    @JacksonXmlProperty(localName = "ShipmentTrackingDetails")
    public ShipmentTrackingDetails ShipmentTrackingDetails;

    @JacksonXmlProperty(localName = "ShippingRateErrorMessage")
    public String shippingRateErrorMessage;

    @JacksonXmlProperty(localName = "ShippingRateType")
    public String shippingRateType;

    @JacksonXmlProperty(localName = "TaxTable")
    public TaxTable taxTable;
}
