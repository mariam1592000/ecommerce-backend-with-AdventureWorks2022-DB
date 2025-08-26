package com.ecommerce.ecommerce_backend.model.person.compositeId;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BusinessEntityAddressId  implements Serializable {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "AddressID", nullable = false)
    private int addressID;

    @Column(name = "AddressTypeID", nullable = false)
    private int addressTypeID;

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getAddressTypeID() {
        return addressTypeID;
    }

    public void setAddressTypeID(int addressTypeID) {
        this.addressTypeID = addressTypeID;
    }

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessEntityAddressId)) return false;
        BusinessEntityAddressId that = (BusinessEntityAddressId) o;
        return businessEntityID == that.businessEntityID &&
                addressID == that.addressID &&
                addressTypeID == that.addressTypeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, addressID, addressTypeID);
    }

}