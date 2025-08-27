package com.ecommerce.ecommerce_backend.model.person;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "StateProvince",schema = "Person")
@Getter
@Setter
public class StateProvince {
    @Id
    @Column(name = "StateProvinceID", nullable = false)
    private Integer stateProvinceID;

    @Column(name = "StateProvinceCode",  columnDefinition = "nchar(3)")
    private String stateProvinceCode;

    @ManyToOne
    @JoinColumn(name = "CountryRegionCode", referencedColumnName = "CountryRegionCode")
    private CountryRegion countryRegionCode;

    @Column(name = "IsOnlyStateProvinceFlag")
    private boolean isOnlyStateProvinceFlag;

    @Column(name = "Name", nullable = false)
    private String name;

    //there is a relationship with the SalesTerritory in the Sales package
    @Column(name = "TerritoryID")
    private int territoryID;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}