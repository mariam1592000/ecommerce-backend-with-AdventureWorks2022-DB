package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.person.CountryRegion;
import com.ecommerce.ecommerce_backend.model.sales.compositeId.CountryRegionCurrencyId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "CountryRegionCurrency",schema = "Sales")
@Getter
@Setter
public class CountryRegionCurrency {

    @EmbeddedId
    CountryRegionCurrencyId countryRegionCurrencyId;

    @ManyToOne
    @JoinColumn(name = "CountryRegionCode", referencedColumnName = "CountryRegionCode", insertable=false, updatable=false)
    private CountryRegion countryRegion;

    @ManyToOne
    @JoinColumn(name = "CurrencyCode", referencedColumnName = "CurrencyCode", insertable=false, updatable=false)
    private Currency currency;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}