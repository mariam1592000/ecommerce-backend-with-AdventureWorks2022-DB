package com.ecommerce.ecommerce_backend.model.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "BusinessEntity",schema = "Person")
@Getter
@Setter
public class BusinessEntity {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}