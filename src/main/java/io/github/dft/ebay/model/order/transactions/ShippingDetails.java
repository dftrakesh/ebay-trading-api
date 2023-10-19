package io.github.dft.ebay.model.order.transactions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.github.dft.ebay.model.order.InternationalShippingServiceOption;
import io.github.dft.ebay.model.order.SalesTax;
import io.github.dft.ebay.model.order.transactions.tax.TaxTable;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingDetails implements Serializable {

    @JacksonXmlProperty(localName = "CalculatedShippingRate")
    private CalculatedShippingRate calculatedShippingRate;

    @JacksonXmlProperty(localName = "eBayCollectAndRemitTaxes")
    private TaxTable taxTable;

    @JacksonXmlProperty(localName = "ShipmentTrackingDetails")
    private ShipmentTrackingDetails shipmentTrackingDetails;

    @JacksonXmlProperty(localName = "CODCost")
    private String codCost;

    @JacksonXmlProperty(localName = "eBayEstimatedLabelCost")
    private String eBayEstimatedLabelCost;

    @JacksonXmlProperty(localName = "InternationalShippingServiceOption")
    private InternationalShippingServiceOption internationalShippingServiceOption;

    @JacksonXmlProperty(localName = "SalesTax")
    private SalesTax salesTax;

    @JacksonXmlProperty(localName = "SellingManagerSalesRecordNumber")
    private String sellingManagerSalesRecordNumber;

    @JacksonXmlProperty(localName = "ShippingServiceOptions")
    private ShippingServiceOptions shippingServiceOptions;
}