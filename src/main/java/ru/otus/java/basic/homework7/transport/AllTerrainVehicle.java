package ru.otus.java.basic.homework7.transport;

import ru.otus.java.basic.homework7.terrain.Terrain;

import java.util.List;

public class AllTerrainVehicle implements Moveable {
    private int fuel;

    public AllTerrainVehicle(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (distance > this.fuel) {
            System.out.println("У вездехода не хватило топлива");
            return false;
        } else {
            System.out.println("Вездеход проехал по местности " + terrain.getName());
            this.fuel = this.fuel - distance;
            return true;
        }
    }
}
