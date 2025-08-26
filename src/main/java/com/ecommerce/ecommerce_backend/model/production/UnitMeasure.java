package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "UnitMeasure", schema = "Production")
@Getter
@Setter
public class UnitMeasure {
    @Id
    @Column(name = "UnitMeasureCode", nullable = false, columnDefinition = "nchar(3)")
    private String unitMeasureCode;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}