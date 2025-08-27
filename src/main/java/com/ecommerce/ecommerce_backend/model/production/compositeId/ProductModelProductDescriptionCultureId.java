package com.ecommerce.ecommerce_backend.model.production.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Embeddable
@Getter
@Setter
public class ProductModelProductDescriptionCultureId {

    @Column(name = "ProductModelID")
    private int productModelID;

    @Column(name = "ProductDescriptionID")
    private int productDescriptionID;

    @Column(name = "CultureID", columnDefinition = "nchar(6)")
    private String cultureID;

    public ProductModelProductDescriptionCultureId(int productModelID, int productDescriptionID, String cultureID) {
        this.productModelID = productModelID;
        this.productDescriptionID = productDescriptionID;
        this.cultureID = cultureID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductModelProductDescriptionCultureId)) return false;
        ProductModelProductDescriptionCultureId that = (ProductModelProductDescriptionCultureId) o;
        return Objects.equals(productModelID, that.productModelID) &&
                Objects.equals(productDescriptionID, that.productDescriptionID) &&
                Objects.equals(cultureID,that.cultureID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productModelID, productDescriptionID,cultureID);
    }
}
