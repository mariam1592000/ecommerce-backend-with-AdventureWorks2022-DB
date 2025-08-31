package com.ecommerce.ecommerce_backend.model.sales.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Embeddable
@Getter
@Setter
public class PersonCreditCardId {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "CreditCardID", nullable = false)
    private int creditCardID;

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonCreditCardId)) return false;
        PersonCreditCardId that = (PersonCreditCardId) o;
        return businessEntityID == that.businessEntityID &&
                creditCardID == that.creditCardID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, creditCardID);
    }

}