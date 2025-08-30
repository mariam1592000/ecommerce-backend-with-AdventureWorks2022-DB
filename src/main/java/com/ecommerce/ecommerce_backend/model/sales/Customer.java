package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.person.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Customer",schema = "Sales")
@Getter
@Setter
public class Customer {
    @Id
    @Column(name = "CustomerID", nullable = false)
    private int customerID;

    @ManyToOne
    @JoinColumn(name = "PersonID", referencedColumnName = "BusinessEntityID")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "StoreID", referencedColumnName = "BusinessEntityID")
    private Store store;

    @ManyToOne
    @JoinColumn(name = "TerritoryID", referencedColumnName = "TerritoryID")
    private SalesTerritory salesTerritory;

    @Column(name = "AccountNumber")
    private String accountNumber;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}