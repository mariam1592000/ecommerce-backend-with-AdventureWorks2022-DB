package com.ecommerce.ecommerce_backend.model.person.compositeId;

import jakarta.persistence.*;

import java.util.Objects;


@Embeddable
public class BusinessEntityContactId {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "PersonID", nullable = false)
    private int personID;

    @Column(name = "ContactTypeID", nullable = false)
    private int contactTypeID;

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(int contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

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