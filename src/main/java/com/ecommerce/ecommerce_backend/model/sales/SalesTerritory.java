package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.person.CountryRegion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SalesTerritory",schema = "Sales")
@Getter
@Setter
public class SalesTerritory {
    @Id
    @Column(name = "TerritoryID", nullable = false)
    private int territoryID;

    @Column(name = "Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "CountryRegionCode", referencedColumnName = "CountryRegionCode")
    private CountryRegion countryRegion;

    @Column(name = "Group")
    private String group;

    @Column(name = "SalesYTD")
    private BigDecimal salesYTD;

    @Column(name = "SalesLastYear")
    private BigDecimal salesLastYear;

    @Column(name = "CostYTD")
    private BigDecimal costYTD;

    @Column(name = "CostLastYear")
    private BigDecimal costLastYear;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}