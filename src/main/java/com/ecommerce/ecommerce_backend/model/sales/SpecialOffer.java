package com.ecommerce.ecommerce_backend.model.sales;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SpecialOffer",schema = "Sales")
@Getter
@Setter
public class SpecialOffer {
    @Id
    @Column(name = "SpecialOfferID", nullable = false)
    private int specialOfferID;

    @Column(name = "Description")
    private String description;

    @Column(name = "DiscountPct")
    private BigDecimal discountPct;

    @Column(name = "Type")
    private String type;

    @Column(name = "Category")
    private String category;

    @Column(name = "StartDate")
    private LocalDateTime startDate;

    @Column(name = "EndDate")
    private LocalDateTime endDate;

    @Column(name = "MinQty")
    private int minQty;

    @Column(name = "MaxQty")
    private int maxQty;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}