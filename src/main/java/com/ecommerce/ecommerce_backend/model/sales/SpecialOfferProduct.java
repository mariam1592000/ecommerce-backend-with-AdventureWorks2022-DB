package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.production.Product;
import com.ecommerce.ecommerce_backend.model.sales.compositeId.SpecialOfferProductId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SpecialOfferProduct",schema = "Sales")
@Getter
@Setter
public class SpecialOfferProduct {

    @EmbeddedId
    SpecialOfferProductId specialOfferProductId;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", insertable=false, updatable=false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "SpecialOfferID", referencedColumnName = "SpecialOfferID", insertable=false, updatable=false)
    private SpecialOffer specialOffer;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}