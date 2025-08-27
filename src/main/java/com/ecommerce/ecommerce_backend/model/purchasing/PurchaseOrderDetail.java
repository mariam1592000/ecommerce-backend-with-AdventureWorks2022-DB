package com.ecommerce.ecommerce_backend.model.purchasing;

import com.ecommerce.ecommerce_backend.model.HumanResource.Employee;
import com.ecommerce.ecommerce_backend.model.production.Product;
import com.ecommerce.ecommerce_backend.model.production.UnitMeasure;
import com.ecommerce.ecommerce_backend.model.purchasing.compositeId.ProductVendorId;
import com.ecommerce.ecommerce_backend.model.purchasing.compositeId.PurchaseOrderDetailId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "PurchaseOrderDetail", schema = "Purchasing")
public class PurchaseOrderDetail {
    @EmbeddedId
    private PurchaseOrderDetailId id;

    @ManyToOne
    @JoinColumn(name = "PurchaseOrderID", referencedColumnName = "PurchaseOrderID", insertable = false, updatable = false)
    private PurchaseOrderHeader purchaseOrderHeader;

    @Column(name = "DueDate", nullable = false)
    private LocalDateTime dueDate;

    @Column(name = "OrderQty")
    private short orderQty;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    private Product product;

    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    @Column(name = "LineTotal")
    private BigDecimal lineTotal;

    @Column(name = "ReceivedQty")
    private BigDecimal receivedQty;

    @Column(name = "RejectedQty")
    private BigDecimal rejectedQty;

    @Column(name = "StockedQty")
    private BigDecimal stockedQty;

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate;
}