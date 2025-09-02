package com.ecommerce.ecommerce_backend.dto;

import com.ecommerce.ecommerce_backend.model.production.Product;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDTO {

    private int productID;
    private String name;
    private String productNumber;
    private String color;
    private String size;
    private String sizeUnitMeasureCode;
    private String weightUnitMeasureCode;
    private BigDecimal weight;
    private String productLine;
    private String ProductClass;
    private String style;
    private String productSubcategory;
    private String productCategory;
    private String ProductModelID;
//    private List<ProductProductPhoto> productProductPhotoList = new ArrayList<>();


    public ProductDTO(Product product)
    {
        this.productID = product.getProductID();
        this.name = product.getName();
        this.productNumber = product.getProductNumber();
        this.color = product.getColor();
        this.size = product.getSize();
        this.sizeUnitMeasureCode = product.getSizeUnitMeasureCode() != null ? product.getSizeUnitMeasureCode().getUnitMeasureCode() : null;
        this.weightUnitMeasureCode = product.getWeightUnitMeasureCode() != null ? product.getWeightUnitMeasureCode().getUnitMeasureCode() : null;
        this.weight = product.getWeight();
        this.productLine = product.getProductLine() != null ? product.getProductLine().getDescription() : null;
        this.style = product.getStyle() != null ? product.getStyle().getDescription() : null;
        this.ProductClass = product.getProductClass() != null ? product.getProductClass().getDescription() : null;
        this.productSubcategory = product.getProductSubcategoryID() != null ? product.getProductSubcategoryID().getName() : null;
        this.ProductModelID = product.getProductModelID() != null ? product.getProductModelID().getName() : null;
        this.productCategory = product.getProductSubcategoryID() != null ? product.getProductSubcategoryID().getProductCategoryID().getName() : null;
    }
}
