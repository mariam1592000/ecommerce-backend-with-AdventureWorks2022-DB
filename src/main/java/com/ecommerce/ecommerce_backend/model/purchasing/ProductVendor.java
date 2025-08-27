package com.ecommerce.ecommerce_backend.model.purchasing;

import com.ecommerce.ecommerce_backend.model.production.Product;
import com.ecommerce.ecommerce_backend.model.production.UnitMeasure;
import com.ecommerce.ecommerce_backend.model.purchasing.compositeId.ProductVendorId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ProductVendor", schema = "Purchasing")
@Getter
@Setter
public class ProductVendor {

    @EmbeddedId
    private ProductVendorId id;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    private Vendor vendor;

    @Column(name = "AverageLeadTime")
    private int averageLeadTime;

    @Column(name = "StandardPrice")
    private BigDecimal standardPrice;

    @Column(name = "LastReceiptCost")
    private BigDecimal lastReceiptCost;

    @Column(name = "LastReceiptDate")
    private LocalDateTime lastReceiptDate;

    @Column(name = "MinOrderQty")
    private int minOrderQty;

    @Column(name = "MaxOrderQty")
    private int maxOrderQty;

    @Column(name = "OnOrderQty")
    private int onOrderQty;

    @ManyToOne
    @JoinColumn(name = "UnitMeasureCode", referencedColumnName = "UnitMeasureCode")
    private UnitMeasure unitMeasureCode;

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate;
}
