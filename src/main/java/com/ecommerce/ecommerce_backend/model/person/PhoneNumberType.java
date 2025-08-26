package com.ecommerce.ecommerce_backend.model.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "PhoneNumberType",schema = "Person")
public class PhoneNumberType {
    @Id
    @Column(name = "PhoneNumberTypeID", nullable = false)
    private int phoneNumberTypeID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

    public int getPhoneNumberTypeID() {
        return phoneNumberTypeID;
    }

    public void setPhoneNumberTypeID(int phoneNumberTypeID) {
        this.phoneNumberTypeID = phoneNumberTypeID;
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