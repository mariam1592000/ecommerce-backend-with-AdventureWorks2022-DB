package com.ecommerce.ecommerce_backend.model.production;

import com.ecommerce.ecommerce_backend.model.production.compositeId.ProductProductPhotoId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ProductProductPhoto", schema = "Production")
@Getter
@Setter
public class ProductProductPhoto {

    @EmbeddedId
    private ProductProductPhotoId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable = false, updatable = false)
    //@JsonBackReference // this prevents the recursion that happens when I get the product list it has the photo and the photo has a product reference field
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductPhotoID", referencedColumnName = "ProductPhotoID", insertable = false, updatable = false)
    private ProductPhoto productPhoto;

    @Column(name = "[Primary]", nullable = false)
    private boolean primary;

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate;
}
