package com.ecommerce.ecommerce_backend.model.purchasing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Vendor", schema = "Purchasing")
public class Vendor {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "AccountNumber", nullable = false)
    private String accountNumber;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "CreditRating", nullable = false)
    private short creditRating;

    @Column(name = "PreferredVendorStatus", nullable = false)
    private boolean preferredVendorStatus;

    @Column(name = "ActiveFlag", nullable = false)
    private boolean activeFlag;

    @Column(name = "PurchasingWebServiceURL", nullable = false)
    private String purchasingWebServiceURL;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;


}