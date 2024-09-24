package ru.otus.java.basic.homework7;

import ru.otus.java.basic.homework7.terrain.Terrain;
import ru.otus.java.basic.homework7.transport.Moveable;

public class Human implements Moveable {

    private String name;
    private Moveable currentTransport;

    public Human(String name) {
        this.name = name;
    }

    public void sitDown(Moveable transport) {
        this.currentTransport = transport;

    }

    public void standUp() {
        this.currentTransport = null;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (currentTransport != null && currentTransport.move(terrain, distance)) {
            System.out.println(name + " проехала на транспорте");
            return true;
        } else {
            System.out.println(currentTransport != null ? name + " никуда не поехала" : name + " идёт пешком");
            return false;
        }
    }
}
