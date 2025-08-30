package com.ecommerce.ecommerce_backend.model.sales;

import com.ecommerce.ecommerce_backend.model.production.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ShoppingCartItem",schema = "Sales")
@Getter
@Setter
public class ShoppingCartItem {
    @Id
    @Column(name = "ShoppingCartItemID", nullable = false)
    private int ShoppingCartItemID;

    @Column(name = "ShoppingCartID")
    private String shoppingCartID;

    @Column(name = "Quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    private Product product;

    @Column(name = "DateCreated")
    private LocalDateTime dateCreated;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}