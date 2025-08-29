package com.ecommerce.ecommerce_backend.model.purchasing;

import com.ecommerce.ecommerce_backend.model.Humanresource.Employee;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "PurchaseOrderHeader", schema = "Purchasing")
public class PurchaseOrderHeader {
    @Id
    @Column(name = "PurchaseOrderID", nullable = false)
    private int purchaseOrderID;

    @Column(name = "RevisionNumber", nullable = false)
    private short revisionNumber;

    @Column(name = "Status", nullable = false)
    private short status;

    @ManyToOne
    @JoinColumn(name = "EmployeeID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "VendorID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    private Vendor vendor;

    @ManyToOne
    @JoinColumn(name = "ShipMethodID", referencedColumnName = "ShipMethodID", insertable = false, updatable = false)
    private ShipMethod shipMethod;

    @Column(name = "OrderDate")
    private LocalDateTime orderDate;

    @Column(name = "ShipDate")
    private LocalDateTime shipDate;

    @Column(name = "SubTotal")
    private BigDecimal subTotal;

    @Column(name = "TaxAmt")
    private BigDecimal taxAmt;

    @Column(name = "Freight")
    private BigDecimal freight;

    @Column(name = "TotalDue")
    private BigDecimal totalDue;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;


}