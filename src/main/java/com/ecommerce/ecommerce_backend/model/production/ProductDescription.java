package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ProductDescription", schema = "Production")
public class ProductDescription {
    @Id
    @Column(name = "ProductDescriptionID", nullable = false)
    private int productDescriptionID;

    @Column(name = "Description", nullable = false)
    private String description;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

    public int getProductDescriptionID() {
        return productDescriptionID;
    }

    public void setProductDescriptionID(int productDescriptionID) {
        this.productDescriptionID = productDescriptionID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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