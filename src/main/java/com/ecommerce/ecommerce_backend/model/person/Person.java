package com.ecommerce.ecommerce_backend.model.person;

import com.ecommerce.ecommerce_backend.common.enums.PersonTypeEnum;
import com.ecommerce.ecommerce_backend.common.enums.TitleTypeEnum;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Person",schema = "Person")
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

    public Integer getBusinessEntityID() {
        return businessEntityID;
    }

    public void setBusinessEntityID(Integer businessEntityID) {
        this.businessEntityID = businessEntityID;
    }

    public PersonTypeEnum getPersonType() {
        return personType;
    }

    public void setPersonType(PersonTypeEnum personType) {
        this.personType = personType;
    }

    public boolean getNameStyle() {
        return nameStyle;
    }

    public void setNameStyle(boolean nameStyle) {
        this.nameStyle = nameStyle;
    }

    public TitleTypeEnum getTitle() {
        return title;
    }

    public void setTitle(TitleTypeEnum title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getEmailPromotion() {
        return emailPromotion;
    }

    public void setEmailPromotion(int emailPromotion) {
        this.emailPromotion = emailPromotion;
    }

    public String getAdditionalContactInfo() {
        return additionalContactInfo;
    }

    public void setAdditionalContactInfo(String additionalContactInfo) {
        this.additionalContactInfo = additionalContactInfo;
    }

    public String getDemographics() {
        return demographics;
    }

    public void setDemographics(String demographics) {
        this.demographics = demographics;
    }

    public UUID getRowGuid() {
        return rowGuid;
    }

    public void setRowGuid(UUID rowGuid) {
        this.rowGuid = rowGuid;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}