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
    private boolean changePaymentInstructions;

    @JacksonXmlProperty(localName = "ShippingServiceOptions")
    private ShippingServiceOptions shippingServiceOptions;

    @JacksonXmlProperty(localName = "ShippingType")
    private String shippingType;

    @JacksonXmlProperty(localName = "SellingManagerSalesRecordNumber")
    private String sellingManagerSalesRecordNumber;

    @JacksonXmlProperty(localName = "ShippingServiceUsed")
    private String shippingServiceUsed;

    @JacksonXmlProperty(localName = "CalculatedShippingRate")
    private CalculatedShippingRate calculatedShippingRate;

    @JacksonXmlProperty(localName = "CODCost")
    private String codCost;

    @JacksonXmlProperty(localName = "eBayEstimatedLabelCost")
    private String eBayEstimatedLabelCost;

    @JacksonXmlProperty(localName = "ExcludeShipToLocation")
    private String excludeShipToLocation;

    @JacksonXmlProperty(localName = "InternationalShippingServiceOption")
    private InternationalShippingServiceOption internationalShippingServiceOption;

    @JacksonXmlProperty(localName = "PaymentEdited")
    private String paymentEdited;

    @JacksonXmlProperty(localName = "SalesTax")
    private SalesTax salesTax;

    @JacksonXmlProperty(localName = "ShipmentTrackingDetails")
    private ShipmentTrackingDetails ShipmentTrackingDetails;

    @JacksonXmlProperty(localName = "ShippingRateErrorMessage")
    private String shippingRateErrorMessage;

    @JacksonXmlProperty(localName = "ShippingRateType")
    private String shippingRateType;

    @JacksonXmlProperty(localName = "TaxTable")
    private TaxTable taxTable;
}
