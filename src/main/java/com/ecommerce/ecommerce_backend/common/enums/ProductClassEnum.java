package com.ecommerce.ecommerce_backend.common.enums;

public enum ProductClassEnum {

    H("High"),
    M("Medium"),
    L("Low");

    private final String description;

    ProductClassEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
