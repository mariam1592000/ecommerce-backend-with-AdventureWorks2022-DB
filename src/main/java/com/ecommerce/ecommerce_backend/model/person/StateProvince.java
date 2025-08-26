package com.ecommerce.ecommerce_backend.model.person;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "StateProvince",schema = "Person")
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

    @Column(name = "TerritoryID")
    private int territoryID;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

    public Integer getStateProvinceID() {
        return stateProvinceID;
    }

    public void setStateProvinceID(Integer stateProvinceID) {
        this.stateProvinceID = stateProvinceID;
    }

    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public CountryRegion getCountryRegionCode() {
        return countryRegionCode;
    }

    public void setCountryRegionCode(CountryRegion countryRegionCode) {
        this.countryRegionCode = countryRegionCode;
    }

    public boolean isOnlyStateProvinceFlag() {
        return isOnlyStateProvinceFlag;
    }

    public void setOnlyStateProvinceFlag(boolean onlyStateProvinceFlag) {
        isOnlyStateProvinceFlag = onlyStateProvinceFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTerritoryID() {
        return territoryID;
    }

    public void setTerritoryID(int territoryID) {
        this.territoryID = territoryID;
    }

    public UUID getRowGuid() {
        return rowGuid;
    }

    public void setRowGuid(UUID rowGuid) {
        this.rowGuid = rowGuid;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}