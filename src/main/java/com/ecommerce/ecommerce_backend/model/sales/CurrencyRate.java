package com.ecommerce.ecommerce_backend.model.sales;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "CurrencyRate",schema = "Sales")
@Getter
@Setter
public class CurrencyRate {
    @Id
    @Column(name = "CurrencyRateID", nullable = false)
    private int currencyRateID;

    @Column(name = "CurrencyRateDate")
    private LocalDateTime currencyRateDate;

    @ManyToOne
    @JoinColumn(name = "FromCurrencyCode", referencedColumnName = "CurrencyCode")
    private Currency fromCurrency;

    @ManyToOne
    @JoinColumn(name = "ToCurrencyCode", referencedColumnName = "CurrencyCode")
    private Currency toCurrencyCode;

    @Column(name = "AverageRate")
    private BigDecimal averageRate;

    @Column(name = "EndOfDayRate")
    private BigDecimal endOfDayRate;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}