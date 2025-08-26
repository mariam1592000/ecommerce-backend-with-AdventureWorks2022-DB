package com.ecommerce.ecommerce_backend.model.production;

import com.ecommerce.ecommerce_backend.model.production.compositeId.ProductInventoryId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "ProductInventory", schema = "Production")
@Getter
@Setter
public class ProductInventory {

    @EmbeddedId
    ProductInventoryId productInventoryId;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable=false, updatable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "LocationID", referencedColumnName = "LocationID", insertable=false, updatable=false)
    private Location location;

    @Column(name = "Shelf", nullable = false, length = 10)
    private String shelf;

    @Column(name = "Bin", nullable = false)
    private Short bin;

    @Column(name = "Quantity", nullable = false)
    private Short quantity;

    @Column(name = "rowguid", nullable = false, columnDefinition = "uniqueidentifier")
    private UUID rowguid;

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate;

}