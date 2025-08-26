package com.ecommerce.ecommerce_backend.common.enums;

public enum ProductStyleEnum {

    W("Women"),
    M("Men"),
    U("Universal");

    private final String description;

    ProductStyleEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
