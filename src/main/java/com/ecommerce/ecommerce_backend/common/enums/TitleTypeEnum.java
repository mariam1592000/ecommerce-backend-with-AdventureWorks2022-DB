package com.ecommerce.ecommerce_backend.common.enums;

public enum TitleTypeEnum {

    MR("Mister"),
    MRS("Missus"),
    MS("Miss"),
    SR("Senior"),
    SRA("Señora");

    private final String description;

    TitleTypeEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
