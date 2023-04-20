package edu.sda.java.advanced.trainingTask;

import edu.sda.java.advanced.enums.Gender;

public enum ConnectionType {
    WIFI ("W", "wi-fi"),
    GSM ("G", "GSM"),
    ETHERNET("E", "ethernet");

    private String shortcut;

    private String name;

    ConnectionType(String shortcut, String name) {
        this.shortcut = shortcut;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getShortcut() {
        return shortcut;
    }

    public static ConnectionType findByShortcut(String str) {
        for (ConnectionType value: ConnectionType.values()) {
            if(value.shortcut.equalsIgnoreCase(str)) {
                return value;
            }
        }
        return null; // if no abbreviation is not found
    }
}
