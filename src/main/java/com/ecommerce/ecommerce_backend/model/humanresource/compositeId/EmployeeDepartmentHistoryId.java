package com.ecommerce.ecommerce_backend.model.humanresource.compositeId;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;


@Embeddable
@Getter
@Setter
public class EmployeeDepartmentHistoryId {

    @Column(name = "BusinessEntityID", nullable = false)
    private int businessEntityID;

    @Column(name = "DepartmentID", nullable = false)
    private short departmentID;

    @Column(name = "ShiftID", nullable = false)
    private short shiftID;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    // equals & hashCode (required!)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDepartmentHistoryId)) return false;
        EmployeeDepartmentHistoryId that = (EmployeeDepartmentHistoryId) o;
        return businessEntityID == that.businessEntityID &&
                departmentID == that.departmentID &&
                shiftID == that.shiftID &&
                Objects.equals(startDate, that.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessEntityID, departmentID, shiftID, startDate);
    }

}