package ru.otus.java.basic.homework7.transport;

import ru.otus.java.basic.homework7.terrain.Terrain;

public interface Moveable {
    boolean move(Terrain terrain, int distance);
}
