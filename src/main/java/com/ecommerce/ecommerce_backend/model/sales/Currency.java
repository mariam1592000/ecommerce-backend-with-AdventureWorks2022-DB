package com.ecommerce.ecommerce_backend.model.sales;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Currency",schema = "Sales")
@Getter
@Setter
public class Currency {
    @Id
    @Column(name = "CurrencyCode", nullable = false, columnDefinition = "nchar(3)")
    private String CurrencyCode;

    @Column(name = "Name")
    private String Name;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}