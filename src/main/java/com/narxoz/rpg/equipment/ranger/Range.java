package com.narxoz.rpg.equipment.ranger;

public enum Range {
    SHORT("Short"),
    MEDIUM("Medium"),
    LONG("Long");

    private final String label;

    Range(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
