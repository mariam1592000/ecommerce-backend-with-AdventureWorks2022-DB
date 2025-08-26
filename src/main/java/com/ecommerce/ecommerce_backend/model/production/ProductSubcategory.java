package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ProductSubcategory", schema = "Production")
public class ProductSubcategory {
    @Id
    @Column(name = "ProductSubcategoryID", nullable = false)
    private int productSubcategoryID;

    @ManyToOne
    @JoinColumn(name = "ProductCategoryID", referencedColumnName = "ProductCategoryID")
    private ProductCategory productCategoryID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

    public int getProductSubcategoryID() {
        return productSubcategoryID;
    }

    public void setProductSubcategoryID(int productSubcategoryID) {
        this.productSubcategoryID = productSubcategoryID;
    }

    public ProductCategory getProductCategoryID() {
        return productCategoryID;
    }

    public void setProductCategoryID(ProductCategory productCategoryID) {
        this.productCategoryID = productCategoryID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getRowGuid() {
        return rowGuid;
    }

    public void setRowGuid(UUID rowGuid) {
        this.rowGuid = rowGuid;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}