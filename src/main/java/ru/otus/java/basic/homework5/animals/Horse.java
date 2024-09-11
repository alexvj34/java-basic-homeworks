package ru.otus.java.basic.homework5.animals;

public class Horse extends Animal {
    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    @Override
    public int swim(int distance) {
        int time = distance / this.speedSwim;
        this.endurance = this.endurance - distance * 4;
        if (endurance < 0) {
            System.out.println(name + " Устал");
            return -1;
        } else {
            System.out.println(name + " Проплыл");
            return time;
        }
    }
}