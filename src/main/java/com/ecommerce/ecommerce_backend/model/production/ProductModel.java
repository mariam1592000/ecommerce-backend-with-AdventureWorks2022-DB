package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ProductModel", schema = "Production")
@Getter
@Setter
public class ProductModel {
    @Id
    @Column(name = "ProductModelID", nullable = false)
    private int ProductModelID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "CatalogDescription")
    private String catalogDescription;

    @Column(name = "Instructions")
    private String instructions;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}