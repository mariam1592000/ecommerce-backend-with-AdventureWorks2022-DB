package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ProductSubcategory", schema = "Production")
@Getter
@Setter
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

}