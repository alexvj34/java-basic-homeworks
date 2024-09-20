package ru.otus.java.basic.homework7.transport;

import ru.otus.java.basic.homework7.terrain.Terrain;

import java.util.List;

public class Horse implements Moveable {
    private final List<Terrain> availableTerrain = List.of(Terrain.PLAIN, Terrain.FORREST);
    private int strength;

    public Horse(int strength) {
        this.strength = strength;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (availableTerrain.contains(terrain)) {
            if (distance > this.strength) {
                System.out.println("У лошади не хватило сил");
                return false;
            } else {
                System.out.println("Лошадь проскакала по местности " + terrain.getName());
                this.strength = this.strength - distance;
                return true;
            }
        }
        System.out.println("Лошадь не может скакать по местности " + terrain.getName());
        return false;
    }
}
