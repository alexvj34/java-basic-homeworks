package ru.otus.java.basic.homework7.transport;

import ru.otus.java.basic.homework7.terrain.Terrain;

import java.util.List;

public class Car implements Moveable {
    private final List<Terrain> availableTerrain = List.of(Terrain.PLAIN);
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (availableTerrain.contains(terrain)) {
            if (distance > this.fuel) {
                System.out.println("У машины не хватило топлива");
                return false;
            } else {
                System.out.println("Машина проехала по местности " + terrain.getName());
                this.fuel = this.fuel - distance;
                return true;
            }
        }
        System.out.println("Машина не может ехать по местности " + terrain.getName());
        return false;
    }
}
