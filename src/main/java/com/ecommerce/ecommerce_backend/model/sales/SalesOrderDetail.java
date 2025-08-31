package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.production.Product;
import com.ecommerce.ecommerce_backend.model.sales.compositeId.SalesOrderDetailId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SalesOrderDetail",schema = "Sales")
@Getter
@Setter
public class SalesOrderDetail {

    @EmbeddedId
    SalesOrderDetailId salesOrderDetailId;

    @ManyToOne
    @JoinColumn(name = "SalesOrderID", referencedColumnName = "SalesOrderID", insertable=false, updatable=false)
    private SalesOrderHeader salesOrderHeader;

    @Column(name = "CarrierTrackingNumber")
    private String carrierTrackingNumber;

    @Column(name = "OrderQty")
    private short orderQty;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "SpecialOfferID", referencedColumnName = "SpecialOfferID")
    private SpecialOffer specialOffer;

    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    @Column(name = "UnitPriceDiscount")
    private BigDecimal unitPriceDiscount;

    @Column(name = "LineTotal")
    private BigDecimal lineTotal;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}