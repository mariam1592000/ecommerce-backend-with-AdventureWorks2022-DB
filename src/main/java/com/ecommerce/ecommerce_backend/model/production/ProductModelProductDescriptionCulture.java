package com.ecommerce.ecommerce_backend.model.production;

import com.ecommerce.ecommerce_backend.model.production.compositeId.ProductModelProductDescriptionCultureId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ProductModelProductDescriptionCulture", schema = "Production")
@Getter
@Setter
public class ProductModelProductDescriptionCulture {

    @EmbeddedId
    private ProductModelProductDescriptionCultureId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductDescriptionID", referencedColumnName = "ProductDescriptionID", insertable = false, updatable = false)
    private ProductDescription productDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductModelID", referencedColumnName = "ProductModelID", insertable = false, updatable = false)
    private ProductModel productModelID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CultureID", referencedColumnName = "CultureID", insertable = false, updatable = false)
    private Culture culture;

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate;
}
