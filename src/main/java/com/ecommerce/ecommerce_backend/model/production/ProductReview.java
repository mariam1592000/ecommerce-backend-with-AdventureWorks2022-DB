package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "ProductReview", schema = "Production")
@Getter
@Setter
public class ProductReview {

    @Id
    @Column(name = "ProductReviewID")
    private int productReviewID;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID")
    private Product product;

    @Column(name = "ReviewerName")
    private String reviewerName;

    @Column(name = "ReviewDate")
    private LocalDateTime reviewDate;

    @Column(name = "EmailAddress")
    private String emailAddress;

    @Column(name = "Rating")
    private int rating;

    @Column(name = "Comments")
    private String comments;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}