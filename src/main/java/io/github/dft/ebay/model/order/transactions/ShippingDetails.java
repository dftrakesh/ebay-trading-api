package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.InternationalShippingServiceOption;
import io.github.dft.ebay.model.order.SalesTax;
import io.github.dft.ebay.model.order.transactions.tax.TaxTable;
import lombok.Data;

import java.io.Serializable;

@Data
public class ShippingDetails implements Serializable {

    @JacksonXmlProperty(localName = "CalculatedShippingRate")
    public CalculatedShippingRate calculatedShippingRate;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTaxes")
    public TaxTable taxTable;

    @JacksonXmlProperty(localName = "ShipmentTrackingDetails")
    public ShipmentTrackingDetails shipmentTrackingDetails;

    @JacksonXmlProperty(localName = "CODCost")
    public String codCost;

    @JacksonXmlProperty(localName = "eBayEstimatedLabelCost")
    public String eBayEstimatedLabelCost;

    @JacksonXmlProperty(localName = "InternationalShippingServiceOption")
    public InternationalShippingServiceOption internationalShippingServiceOption;

    @JacksonXmlProperty(localName = "SalesTax")
    public SalesTax salesTax;

    @JacksonXmlProperty(localName = "SellingManagerSalesRecordNumber")
    public String sellingManagerSalesRecordNumber;

    @JacksonXmlProperty(localName = "ShippingServiceOptions")
    public ShippingServiceOptions shippingServiceOptions;
}