package com.ecommerce.ecommerce_backend.model.production.compositeId;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Embeddable
@Getter
@Setter
public class ProductProductPhotoId {


    @Column(name = "ProductID")
    private int productId;

    @Column(name = "ProductPhotoID")
    private int productPhotoID;


    public ProductProductPhotoId(int productId, int productPhotoID) {
        this.productId = productId;
        this.productPhotoID = productPhotoID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductProductPhotoId)) return false;
        ProductProductPhotoId that = (ProductProductPhotoId) o;
        return Objects.equals(productId, that.productId) &&
                Objects.equals(productPhotoID, that.productPhotoID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productPhotoID);
    }
}
