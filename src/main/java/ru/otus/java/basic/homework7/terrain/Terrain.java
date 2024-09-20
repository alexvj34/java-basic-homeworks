package ru.otus.java.basic.homework7.terrain;

public enum Terrain {
    FORREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    private final String name;

    Terrain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
