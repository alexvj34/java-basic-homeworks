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
        if (currentTransport != null) {
            if (currentTransport.move(terrain, distance)) {
                System.out.println(name + " проехала на транспорте");
            } else {
                System.out.println(name + " никуда не поехала");
            }
        } else {
            System.out.println(name + " идёт пешком");
        }
        return false;
    }
}
