package com.company.Enums;

public enum State {
    ON_BASE("on_the_base"),
    ON_THE_ROAD("on_the_road"),
    ON_THE_REPAIR("on_the_repair");

    private String value;

    State(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
