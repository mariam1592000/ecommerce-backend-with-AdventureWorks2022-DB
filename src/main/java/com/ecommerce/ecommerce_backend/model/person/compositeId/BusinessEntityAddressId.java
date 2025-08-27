package com.ecommerce.ecommerce_backend.model.person.compositeId;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class BusinessEntityAddressId  implements Serializable {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "AddressID", nullable = false)
    private int addressID;

    @Column(name = "AddressTypeID", nullable = false)
    private int addressTypeID;
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