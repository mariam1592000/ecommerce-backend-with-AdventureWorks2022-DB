package com.ecommerce.ecommerce_backend.model.production;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Culture", schema = "Production")
@Getter
@Setter
public class Culture {
    @Id
    @Column(name = "CultureID", nullable = false, columnDefinition = "nchar(10)")
    private String cultureID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "ModifiedDate")
    private LocalDateTime modifiedDate;

}