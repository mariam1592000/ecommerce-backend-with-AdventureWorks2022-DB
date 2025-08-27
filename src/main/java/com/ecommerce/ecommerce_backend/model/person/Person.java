package com.ecommerce.ecommerce_backend.model.person;

import com.ecommerce.ecommerce_backend.common.enums.PersonTypeEnum;
import com.ecommerce.ecommerce_backend.common.enums.TitleTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Person",schema = "Person")
@Getter
@Setter
public class Person {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private Integer businessEntityID;

    @Enumerated(EnumType.STRING)
    @Column(name = "PersonType", length = 2,  columnDefinition = "nchar(2)")
    private PersonTypeEnum personType;

    @Column(name = "NameStyle")
    private boolean nameStyle;

    @Enumerated(EnumType.STRING)
    @Column(name = "Title")
    private TitleTypeEnum title;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "MiddleName")
    private String middleName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Suffix")
    private String suffix;

    @Column(name = "EmailPromotion")
    private int emailPromotion;

    @Column(name = "AdditionalContactInfo")
    private String additionalContactInfo;

    @Column(name = "Demographics")
    private String demographics;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}