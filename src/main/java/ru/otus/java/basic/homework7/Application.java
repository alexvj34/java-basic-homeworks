package ru.otus.java.basic.homework7;

import ru.otus.java.basic.homework7.terrain.Terrain;
import ru.otus.java.basic.homework7.transport.*;

public class Application {
    public static void main(String[] args) {
        Human human1 = new Human("Alla Allovna");

        Moveable[] transports = {
                new Car(100), new AllTerrainVehicle(200), new Horse(80), new Bicycle()
        };

        for (Moveable transport : transports) {
            human1.sitDown(transport);
            human1.move(Terrain.PLAIN, 10);
            human1.move(Terrain.FORREST, 5);
            human1.move(Terrain.SWAMP, 2);
            human1.standUp();
            human1.move(Terrain.PLAIN, 5);
        }
    }
}