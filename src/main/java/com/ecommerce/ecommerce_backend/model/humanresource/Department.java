package com.ecommerce.ecommerce_backend.model.humanresource;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Department", schema = "HumanResources")
public class Department {
    @Id
    @Column(name = "DepartmentID", nullable = false)
    private short departmentID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "GroupName", nullable = false)
    private String groupName;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}