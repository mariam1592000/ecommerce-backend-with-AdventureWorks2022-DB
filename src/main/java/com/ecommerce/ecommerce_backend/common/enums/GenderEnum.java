package com.ecommerce.ecommerce_backend.common.enums;

import lombok.Getter;

@Getter
public enum GenderEnum {

    M("Male"),
    F("Female");

    private final String description;

    GenderEnum(String description) {
        this.description = description;
    }

}
