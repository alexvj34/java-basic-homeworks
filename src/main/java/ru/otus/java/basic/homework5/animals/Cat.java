package ru.otus.java.basic.homework5.animals;

public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }


    @Override
    public int swim(int distance) {
        System.out.println(name + " не любит воду");
        return -1;
    }
}