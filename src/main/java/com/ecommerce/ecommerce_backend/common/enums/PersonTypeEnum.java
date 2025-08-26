package com.ecommerce.ecommerce_backend.common.enums;

public enum PersonTypeEnum {

    EM("Employee"),
    IN("Individual"),
    SC("Store Contact"),
    SP("Sales Person"),
    VC("Vendor Contact"),
    GC("General Contact");

    private final String description;

    PersonTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
