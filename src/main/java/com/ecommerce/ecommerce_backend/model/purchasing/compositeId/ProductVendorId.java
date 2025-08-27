package com.ecommerce.ecommerce_backend.model.purchasing.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductVendorId implements Serializable {

    @Column(name = "ProductID")
    private int productId;

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    public ProductVendorId() {}

    public ProductVendorId(Integer productId, int businessEntityID) {
        this.productId = productId;
        this.businessEntityID = businessEntityID;
    }

    // getters & setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductVendorId)) return false;
        ProductVendorId that = (ProductVendorId) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(businessEntityID, that.businessEntityID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, businessEntityID);
    }
}
