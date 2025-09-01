package com.ecommerce.ecommerce_backend.model.production;

import com.ecommerce.ecommerce_backend.common.enums.ProductClassEnum;
import com.ecommerce.ecommerce_backend.common.enums.ProductLineEnum;
import com.ecommerce.ecommerce_backend.common.enums.ProductStyleEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Product", schema = "Production")
@Getter
@Setter
public class Product {
    @Id
    @Column(name = "ProductID", nullable = false)
    private int productID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ProductNumber", nullable = false)
    private String productNumber;

    @Column(name = "MakeFlag")
    private boolean makeFlag;

    @Column(name = "FinishedGoodsFlag")
    private boolean finishedGoodsFlag;

    @Column(name = "Color")
    private String color;

    @Column(name = "SafetyStockLevel")
    private short safetyStockLevel;

    @Column(name = "ReorderPoint")
    private short reorderPoint;

    @Column(name = "StandardCost")
    private BigDecimal standardCost;

    @Column(name = "ListPrice")
    private BigDecimal listPrice;

    @Column(name = "Size")
    private String size;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SizeUnitMeasureCode", referencedColumnName = "UnitMeasureCode")
    private UnitMeasure sizeUnitMeasureCode;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "WeightUnitMeasureCode", referencedColumnName = "UnitMeasureCode")
    private UnitMeasure weightUnitMeasureCode;

    @Column(name = "Weight")
    private BigDecimal weight;

    @Column(name = "DaysToManufacture")
    private int daysToManufacture;

    @Enumerated(EnumType.STRING)
    @Column(name = "ProductLine", columnDefinition = "nchar(2)")
    private ProductLineEnum productLine;

    @Enumerated(EnumType.STRING)
    @Column(name = "Class", columnDefinition = "nchar(2)")
    private ProductClassEnum ProductClass;

    @Enumerated(EnumType.STRING)
    @Column(name = "Style", columnDefinition = "nchar(2)")
    private ProductStyleEnum style;

    @ManyToOne
    @JoinColumn(name = "ProductSubcategoryID", referencedColumnName = "ProductSubcategoryID")
    private ProductSubcategory productSubcategoryID;

    @ManyToOne
    @JoinColumn(name = "ProductModelID", referencedColumnName = "ProductModelID")
    private ProductModel ProductModelID;

    @Column(name = "SellStartDate")
    private LocalDateTime sellStartDate;

    @Column(name = "SellEndDate")
    private LocalDateTime sellEndDate;

    @Column(name = "DiscontinuedDate")
    private LocalDateTime discontinuedDate;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

    @OneToMany(orphanRemoval = true, mappedBy = "product")
    @JsonIgnore
    private List<ProductProductPhoto> productProductPhotoList = new ArrayList<>();

}