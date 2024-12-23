package com.flexshose.flexshoesbackend.entity;

public enum Gender {
    MEN("MEN"), WOMEN("WOMEN"), UNISEX("UNISEX");
    
    private final String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
