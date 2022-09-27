package io.github.dft.ebay.model.seller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pagination {

    @JacksonXmlProperty(localName = "EntriesPerPage")
    private Integer entriesPerPage;

    @JacksonXmlProperty(localName = "PageNumber")
    private Integer pageNumber;
}
