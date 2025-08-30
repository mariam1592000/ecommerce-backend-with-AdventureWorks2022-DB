package com.ecommerce.ecommerce_backend.model.sales;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Store",schema = "Sales")
@Getter
@Setter
public class Store {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "Name")
    private String Name;

    @ManyToOne
    @JoinColumn(name = "SalesPersonID", referencedColumnName = "BusinessEntityID")
    private SalesPerson salesPerson;

    @Column(name = "Demographics", columnDefinition = "geography")
    private String demographics;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}