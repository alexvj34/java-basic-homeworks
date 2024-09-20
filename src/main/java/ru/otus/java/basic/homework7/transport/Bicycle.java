package ru.otus.java.basic.homework7.transport;

import ru.otus.java.basic.homework7.terrain.Terrain;

import java.util.List;

public class Bicycle implements Moveable {
    private final List<Terrain> availableTerrain = List.of(Terrain.PLAIN, Terrain.FORREST);

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (availableTerrain.contains(terrain)) {
            System.out.println("Велосипед проехал по местности " + terrain.getName());
            return true;
        }
        System.out.println("Велосипед не может ехать по местности " + terrain.getName());
        return false;
    }
}
