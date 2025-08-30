package com.ecommerce.ecommerce_backend.model.sales.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Embeddable
@Getter
@Setter
public class CountryRegionCurrencyId {

    @Column(name = "CountryRegionCode", nullable = false)
    private String countryRegionCode;

    @Column(name = "CurrencyCode", nullable = false, columnDefinition = "nchar(3)")
    private String currencyCode;

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CountryRegionCurrencyId)) return false;
        CountryRegionCurrencyId that = (CountryRegionCurrencyId) o;
        return Objects.equals(countryRegionCode,that.countryRegionCode) &&
                Objects.equals(currencyCode,that.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryRegionCode, currencyCode);
    }

}