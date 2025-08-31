package com.ecommerce.ecommerce_backend.model.humanresource;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "Shift", schema = "HumanResources")
public class Shift {
    @Id
    @Column(name = "ShiftID", nullable = false)
    private short shiftID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "StartTime", nullable = false)
    private LocalTime startTime;

    @Column(name = "EndTime", nullable = false)
    private LocalTime endTime;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}