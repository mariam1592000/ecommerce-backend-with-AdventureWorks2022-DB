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
@Table(name = "ProductDescription", schema = "Production")
@Getter
@Setter
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

}