package com.ecommerce.ecommerce_backend.model.person;

import com.ecommerce.ecommerce_backend.model.person.compositeId.BusinessEntityAddressId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "BusinessEntityAddress",schema = "Person")
@Getter
@Setter
public class BusinessEntityAddress {

    @EmbeddedId
    private BusinessEntityAddressId id;

    // 🔹 Relationships (FKs)
    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", insertable = false, updatable = false)
    private BusinessEntity businessEntity;

    @ManyToOne
    @JoinColumn(name = "AddressID", insertable = false, updatable = false)
    private Address address;

    @ManyToOne
    @JoinColumn(name = "AddressTypeID", insertable = false, updatable = false)
    private AddressType addressType;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}