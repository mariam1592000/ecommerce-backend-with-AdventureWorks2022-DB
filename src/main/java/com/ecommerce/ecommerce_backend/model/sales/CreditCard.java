package com.ecommerce.ecommerce_backend.model.sales;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "CreditCard",schema = "Sales")
@Getter
@Setter
public class CreditCard {
    @Id
    @Column(name = "CreditCardID", nullable = false)
    private int CreditCardID;

    @Column(name = "CardType")
    private String cardType;

    @Column(name = "CardNumber")
    private String cardNumber;

    @Column(name = "ExpMonth")
    private short expMonth;

    @Column(name = "ExpYear")
    private short expYear;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}