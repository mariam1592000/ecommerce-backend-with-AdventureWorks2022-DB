package com.ecommerce.ecommerce_backend.model.person;

import com.ecommerce.ecommerce_backend.model.person.compositeId.PersonPhoneId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "PersonPhone",schema = "Person")
@Getter
@Setter
public class PersonPhone {

    @EmbeddedId
    private PersonPhoneId id;

    // 🔹 Relationships (FKs)
    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", insertable = false, updatable = false)
    private Person businessEntity;

    @ManyToOne
    @JoinColumn(name = "PhoneNumberTypeID", insertable = false, updatable = false)
    private PhoneNumberType phoneNumberType;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}