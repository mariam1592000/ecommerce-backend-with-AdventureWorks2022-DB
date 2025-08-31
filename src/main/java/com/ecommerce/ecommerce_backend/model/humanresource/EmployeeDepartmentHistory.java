package com.ecommerce.ecommerce_backend.model.humanresource;

import com.ecommerce.ecommerce_backend.model.humanresource.compositeId.EmployeeDepartmentHistoryId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "EmployeeDepartmentHistory",schema = "HumanResources")
@Getter
@Setter
public class EmployeeDepartmentHistory {

    @EmbeddedId
    EmployeeDepartmentHistoryId employeeDepartmentHistoryId;

    @ManyToOne
    @JoinColumn(name = "BusinessEntityID", referencedColumnName = "BusinessEntityID", insertable=false, updatable=false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "DepartmentID", referencedColumnName = "DepartmentID", insertable=false, updatable=false)
    private Department department;

    @ManyToOne
    @JoinColumn(name = "ShiftID", referencedColumnName = "ShiftID", insertable=false, updatable=false)
    private Shift shift;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;
}