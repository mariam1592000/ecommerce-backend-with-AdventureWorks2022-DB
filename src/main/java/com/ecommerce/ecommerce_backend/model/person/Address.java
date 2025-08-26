package com.ecommerce.ecommerce_backend.model.person;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "Address",schema = "Person")
@Getter
@Setter
public class Address {
    @Id
    @Column(name = "AddressID", nullable = false)
    private int addressID;

    @Column(name = "AddressLine1", nullable = false)
    private String addressLine1;

    @Column(name = "AddressLine2")
    private String addressLine2;

    @Column(name = "City", nullable = false)
    private String city;

    @ManyToOne
    @JoinColumn(name = "StateProvinceID", referencedColumnName = "StateProvinceID")
    private StateProvince stateProvince;

    @Column(name = "PostalCode")
    private String postalCode;

    @Column(name = "SpatialLocation", columnDefinition = "geography")
    private String spatialLocation;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}