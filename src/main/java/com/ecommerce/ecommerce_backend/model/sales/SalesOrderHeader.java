package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.person.Address;
import com.ecommerce.ecommerce_backend.model.purchasing.ShipMethod;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "SalesOrderHeader", schema = "Sales")
@Getter
@Setter
public class SalesOrderHeader {

    @Id
    @Column(name = "SalesOrderID")
    private int salesOrderId;

    @Column(name = "RevisionNumber", nullable = false)
    private Byte revisionNumber;

    @Column(name = "OrderDate", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "DueDate", nullable = false)
    private LocalDateTime dueDate;

    @Column(name = "ShipDate")
    private LocalDateTime shipDate;

    @Column(name = "Status", nullable = false)
    private short status;

    @Column(name = "OnlineOrderFlag", nullable = false)
    private Boolean onlineOrderFlag;

    @Column(name = "SalesOrderNumber", nullable = false)
    private String salesOrderNumber;

    @Column(name = "PurchaseOrderNumber")
    private String purchaseOrderNumber;

    @Column(name = "AccountNumber")
    private String accountNumber;

    @Column(name = "CustomerID", nullable = false)
    private int customerId;
    
    @ManyToOne
    @JoinColumn(name = "CustomerID", referencedColumnName = "CustomerID")
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "SalesPersonID", referencedColumnName = "BusinessEntityID")
    private SalesPerson salesPerson;

    @ManyToOne
    @JoinColumn(name = "TerritoryID", referencedColumnName = "TerritoryID")
    private SalesTerritory salesTerritory;

    @ManyToOne
    @JoinColumn(name = "BillToAddressID", referencedColumnName = "AddressID")
    private Address billToAddress;

    @ManyToOne
    @JoinColumn(name = "ShipToAddressID", referencedColumnName = "AddressID")
    private Address shipToAddress;

    @ManyToOne
    @JoinColumn(name = "ShipMethodID", referencedColumnName = "ShipMethodID")
    private ShipMethod shipMethod;

    @ManyToOne
    @JoinColumn(name = "CreditCardID", referencedColumnName = "CreditCardID")
    private CreditCard CreditCard;

    @Column(name = "CreditCardApprovalCode")
    private String creditCardApprovalCode;

    @ManyToOne
    @JoinColumn(name = "CurrencyRateID", referencedColumnName = "CurrencyRateID")
    private CurrencyRate currencyRate;

    @Column(name = "SubTotal")
    private BigDecimal subTotal;

    @Column(name = "TaxAmt")
    private BigDecimal taxAmt;

    @Column(name = "Freight")
    private BigDecimal freight;

    @Column(name = "TotalDue")
    private BigDecimal totalDue;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate", nullable = false)
    private LocalDateTime modifiedDate;

}
