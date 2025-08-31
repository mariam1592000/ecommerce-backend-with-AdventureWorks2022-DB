package com.ecommerce.ecommerce_backend.model.humanresource;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "JobCandidate", schema = "HumanResources")
public class JobCandidate {
    @Id
    @Column(name = "JobCandidateID", nullable = false)
    private int jobCandidateID;

    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID")
    private Employee employee;

    @Column(name = "Resume", columnDefinition = "xml")
    private String resume;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}