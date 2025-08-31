package com.ecommerce.ecommerce_backend.model.sales.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Embeddable
@Getter
@Setter
public class SpecialOfferProductId {

    @Column(name = "SpecialOfferID", nullable = false)
    private int specialOfferID;

    @Column(name = "ProductID", nullable = false)
    private int productID;

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpecialOfferProductId)) return false;
        SpecialOfferProductId that = (SpecialOfferProductId) o;
        return specialOfferID == that.specialOfferID &&
                productID == that.productID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialOfferID, productID);
    }

}