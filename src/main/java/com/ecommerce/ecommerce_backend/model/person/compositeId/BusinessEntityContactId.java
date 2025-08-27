package com.ecommerce.ecommerce_backend.model.person.compositeId;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Embeddable
@Getter
@Setter
public class BusinessEntityContactId {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "PersonID", nullable = false)
    private int personID;

    @Column(name = "ContactTypeID", nullable = false)
    private int contactTypeID;

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessEntityContactId)) return false;
        BusinessEntityContactId that = (BusinessEntityContactId) o;
        return businessEntityID == that.businessEntityID &&
                personID == that.personID &&
                contactTypeID == that.contactTypeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, personID, contactTypeID);
    }

}