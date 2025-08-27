package com.ecommerce.ecommerce_backend.model.purchasing.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PurchaseOrderDetailId implements Serializable {

    @Column(name = "PurchaseOrderID")
    private int purchaseOrderID;

    @Column(name = "PurchaseOrderDetailID", nullable = false)
    private int purchaseOrderDetailID;

    public PurchaseOrderDetailId() {}

    public PurchaseOrderDetailId(Integer purchaseOrderID, int purchaseOrderDetailID) {
        this.purchaseOrderID = purchaseOrderID;
        this.purchaseOrderDetailID = purchaseOrderDetailID;
    }

    // getters & setters

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseOrderDetailId)) return false;
        PurchaseOrderDetailId that = (PurchaseOrderDetailId) o;
        return Objects.equals(purchaseOrderID, that.purchaseOrderID) &&
                Objects.equals(purchaseOrderDetailID, that.purchaseOrderDetailID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseOrderID, purchaseOrderDetailID);
    }
}
