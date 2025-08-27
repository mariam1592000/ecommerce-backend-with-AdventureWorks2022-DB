package com.ecommerce.ecommerce_backend.common.enums;

public enum MaritalStatusEnum {

    M("Married"),
    S("Single");

    private final String description;

    MaritalStatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
