package com.muxi.sample.spring.enums;

public enum DynamicDataSourceEnum {
    READ("read", "读"),
    WRITE("write", "写");

    private String value;
    private String desc;

    DynamicDataSourceEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean is(String value) {
        return this.value.equalsIgnoreCase(value) ? true : false;
    }
}
