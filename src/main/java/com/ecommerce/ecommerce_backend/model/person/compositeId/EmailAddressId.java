package com.ecommerce.ecommerce_backend.model.person.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;


@Embeddable
public class EmailAddressId {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "EmailAddressID", nullable = false)
    private int emailAddressID;

    public int getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(int businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public int getEmailAddressID() {
        return emailAddressID;
    }

    public void setEmailAddressID(int emailAddressID) {
        this.emailAddressID = emailAddressID;
    }

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailAddressId)) return false;
        EmailAddressId that = (EmailAddressId) o;
        return businessEntityID == that.businessEntityID &&
                emailAddressID == that.emailAddressID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, emailAddressID);
    }

}