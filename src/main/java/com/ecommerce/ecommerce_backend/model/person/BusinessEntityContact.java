package com.ecommerce.ecommerce_backend.model.person;

import com.ecommerce.ecommerce_backend.model.person.compositeId.BusinessEntityContactId;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "BusinessEntityContact",schema = "Person")
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

    public BusinessEntityContactId getBusinessEntityContactId() {
        return businessEntityContactId;
    }

    public void setBusinessEntityContactId(BusinessEntityContactId businessEntityContactId) {
        this.businessEntityContactId = businessEntityContactId;
    }

    public BusinessEntity getBusinessEntity() {
        return businessEntity;
    }

    public void setBusinessEntity(BusinessEntity businessEntity) {
        this.businessEntity = businessEntity;
    }

    public Person getPersonID() {
        return PersonID;
    }

    public void setPersonID(Person personID) {
        PersonID = personID;
    }

    public ContactType getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(ContactType contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

    public UUID getRowGuid() {
        return rowGuid;
    }

    public void setRowGuid(UUID rowGuid) {
        this.rowGuid = rowGuid;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}