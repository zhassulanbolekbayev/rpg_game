package com.narxoz.rpg.equipment.factory;

import java.util.Map;

public final class EquipmentCreater {
    private final Map<String, EquipmentFactory> factories;
    
    public EquipmentCreater(Map<String, EquipmentFactory> factories) {
        this.factories = factories;
    }

    public void register(EquipmentFactory factory) {
        factories.put(factory.themekey().toLowerCase(), factory);
    }   

    public EquipmentFactory get(String type) {
        EquipmentFactory factory = factories.get(type.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Unknown equipment type: " + type);
        }
        return factory;
    }   

    public Map<String, EquipmentFactory> getAvailableTypes() {
        return factories;
    }       
}
