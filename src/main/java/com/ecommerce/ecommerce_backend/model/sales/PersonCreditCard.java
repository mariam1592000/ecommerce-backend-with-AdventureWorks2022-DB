package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.person.Person;
import com.ecommerce.ecommerce_backend.model.sales.compositeId.PersonCreditCardId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "PersonCreditCard",schema = "Sales")
@Getter
@Setter
public class PersonCreditCard {

    @EmbeddedId
    PersonCreditCardId personCreditCardId;

    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable=false, updatable=false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "CreditCardID", referencedColumnName = "CreditCardID", insertable=false, updatable=false)
    private CreditCard creditCardID;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}