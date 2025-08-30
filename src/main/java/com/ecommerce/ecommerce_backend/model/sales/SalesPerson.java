package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.humanresource.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SalesPerson",schema = "Sales")
@Getter
@Setter
public class SalesPerson {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @OneToOne
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "TerritoryID", referencedColumnName = "TerritoryID")
    private SalesTerritory salesTerritory;

    @Column(name = "SalesQuota")
    private BigDecimal salesQuota;

    @Column(name = "Bonus")
    private BigDecimal bonus;

    @Column(name = "CommissionPct")
    private BigDecimal commissionPct;

    @Column(name = "SalesYTD")
    private BigDecimal salesYTD;

    @Column(name = "SalesLastYear")
    private BigDecimal salesLastYear;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}