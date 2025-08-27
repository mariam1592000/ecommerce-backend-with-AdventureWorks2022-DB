package com.ecommerce.ecommerce_backend.model.person;

import com.ecommerce.ecommerce_backend.model.person.compositeId.BusinessEntityContactId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "BusinessEntityContact",schema = "Person")
@Getter
@Setter
public class BusinessEntityContact {
    @EmbeddedId
    private BusinessEntityContactId businessEntityContactId;

    // 🔹 Relationships (FKs)
    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    private BusinessEntity businessEntity;

    @ManyToOne
    @JoinColumn(name = "PersonID", referencedColumnName = "BusinessEntityID", insertable = false, updatable = false)
    private Person PersonID;

    @ManyToOne
    @JoinColumn(name = "ContactTypeID", referencedColumnName = "ContactTypeID", insertable = false, updatable = false)
    private ContactType contactTypeID;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}