package com.ecommerce.ecommerce_backend.model.sales.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;


@Embeddable
@Getter
@Setter
public class SalesOrderDetailId {

    @Column(name = "SalesOrderID", nullable = false)
    private int salesOrderID;

    @Column(name = "SalesOrderDetailID", nullable = false)
    private int salesOrderDetailID;

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SalesOrderDetailId)) return false;
        SalesOrderDetailId that = (SalesOrderDetailId) o;
        return salesOrderID == that.salesOrderID &&
                salesOrderDetailID == that.salesOrderDetailID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesOrderID, salesOrderDetailID);
    }

}