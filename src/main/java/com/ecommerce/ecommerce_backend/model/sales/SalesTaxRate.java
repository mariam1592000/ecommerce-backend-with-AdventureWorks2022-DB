package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.person.StateProvince;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SalesTaxRate",schema = "Sales")
@Getter
@Setter
public class SalesTaxRate {
    @Id
    @Column(name = "SalesTaxRateID", nullable = false)
    private int salesTaxRateID;

    @ManyToOne
    @JoinColumn(name = "StateProvinceID", referencedColumnName = "StateProvinceID")
    private StateProvince stateProvince;

    @Column(name = "TaxType")
    private short taxType;

    @Column(name = "TaxRate")
    private BigDecimal taxRate;

    @Column(name = "Name")
    private String Name;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}