package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Location", schema = "Production")
@Getter
@Setter
public class Location {
    @Id
    @Column(name = "LocationID", nullable = false)
    private short locationID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "CostRate", nullable = false)
    private BigDecimal costRate;

    @Column(name = "Availability", nullable = false)
    private BigDecimal availability;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}