package com.ecommerce.ecommerce_backend.common.enums;

public enum ProductLineEnum {

    R("Road"),
    M("Mountain"),
    T("Touring"),
    S("Standard");

    private final String description;

    ProductLineEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
