package com.ecommerce.ecommerce_backend.model.humanresource;

import com.ecommerce.ecommerce_backend.common.enums.GenderEnum;
import com.ecommerce.ecommerce_backend.common.enums.MaritalStatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Employee", schema = "HumanResources")
public class Employee {
    @Id
    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "NationalIDNumber", nullable = false)
    private String nationalIDNumber;

    @Column(name = "LoginID", nullable = false)
    private String loginID;

    @Column(name = "OrganizationNode")
    private byte[] organizationNode;

    @Column(name = "OrganizationLevel")
    private short organizationLevel;

    @Column(name = "JobTitle")
    private String jobTitle;

    @Column(name = "BirthDate")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "MaritalStatus", nullable = false, columnDefinition = "nchar(2)")
    private MaritalStatusEnum maritalStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "Gender", nullable = false, columnDefinition = "nchar(2)")
    private GenderEnum gender;

    @Column(name = "HireDate")
    private LocalDate hireDate;

    @Column(name = "SalariedFlag")
    private boolean salariedFlag;

    @Column(name = "VacationHours")
    private short VacationHours;

    @Column(name = "SickLeaveHours")
    private short sickLeaveHours;

    @Column(name = "CurrentFlag")
    private boolean currentFlag;

    @Column(name = "rowguid", columnDefinition = "uniqueidentifier")
    private UUID rowGuid;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}