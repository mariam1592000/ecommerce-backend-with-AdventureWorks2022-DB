package com.ecommerce.ecommerce_backend.model.production.compositeId;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductInventoryId implements Serializable {

    @Column(name = "ProductID")
    private int productId;

    @Column(name = "LocationID")
    private Short locationId;

    public ProductInventoryId() {}

    public ProductInventoryId(Integer productId, Short locationId) {
        this.productId = productId;
        this.locationId = locationId;
    }

    // getters & setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductInventoryId)) return false;
        ProductInventoryId that = (ProductInventoryId) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(locationId, that.locationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, locationId);
    }
}
