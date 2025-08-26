package com.ecommerce.ecommerce_backend.model.person;

import com.ecommerce.ecommerce_backend.model.person.compositeId.BusinessEntityAddressId;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "BusinessEntityAddress",schema = "Person")
public class BusinessEntityAddress {

    @EmbeddedId
    private BusinessEntityAddressId id;

    // 🔹 Relationships (FKs)
    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", insertable = false, updatable = false)
    private BusinessEntity businessEntity;

    @ManyToOne
    @JoinColumn(name = "AddressID", insertable = false, updatable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "AddressTypeID", insertable = false, updatable = false)
    private AddressType addressType;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

    public BusinessEntityAddressId getId() {
        return id;
    }

    public void setId(BusinessEntityAddressId id) {
        this.id = id;
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

    public BusinessEntity getBusinessEntity() {
        return businessEntity;
    }

    public void setBusinessEntity(BusinessEntity businessEntity) {
        this.businessEntity = businessEntity;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }
}