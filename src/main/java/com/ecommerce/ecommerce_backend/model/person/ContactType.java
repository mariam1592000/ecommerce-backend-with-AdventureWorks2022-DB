package com.ecommerce.ecommerce_backend.model.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "ContactType",schema = "Person")
public class ContactType {
    @Id
    @Column(name = "ContactTypeID", nullable = false)
    private int contactTypeID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

    public int getContactTypeID() {
        return contactTypeID;
    }

    public void setContactTypeID(int contactTypeID) {
        this.contactTypeID = contactTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}