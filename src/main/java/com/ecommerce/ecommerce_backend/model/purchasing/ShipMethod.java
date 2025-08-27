package com.ecommerce.ecommerce_backend.model.purchasing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ShipMethod", schema = "Purchasing")
public class ShipMethod {
    @Id
    @Column(name = "ShipMethodID", nullable = false)
    private int shipMethodID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ShipBase", nullable = false)
    private BigDecimal shipBase;

    @Column(name = "ShipRate", nullable = false)
    private BigDecimal shipRate;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;


}