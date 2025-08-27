package com.ecommerce.ecommerce_backend.model.person;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ContactType",schema = "Person")
@Getter
@Setter
public class ContactType {
    @Id
    @Column(name = "ContactTypeID", nullable = false)
    private int contactTypeID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}