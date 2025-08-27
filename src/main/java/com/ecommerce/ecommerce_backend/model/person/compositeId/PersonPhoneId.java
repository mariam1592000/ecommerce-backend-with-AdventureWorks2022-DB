package com.ecommerce.ecommerce_backend.model.person.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class PersonPhoneId implements Serializable {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "PhoneNumber", nullable = false)
    private String phoneNumber;

    @Column(name = "PhoneNumberTypeID", nullable = false)
    private int phoneNumberTypeID;

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonPhoneId)) return false;
        PersonPhoneId that = (PersonPhoneId) o;
        return businessEntityID == that.businessEntityID &&
                phoneNumber.equals(that.phoneNumber) &&
                phoneNumberTypeID == that.phoneNumberTypeID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, phoneNumber, phoneNumberTypeID);
    }

}