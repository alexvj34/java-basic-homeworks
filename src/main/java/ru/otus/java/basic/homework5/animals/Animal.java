package ru.otus.java.basic.homework5.animals;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int endurance;

    public void info() {
        System.out.println(name + " " + speedRun + " " + speedSwim + " " + endurance);
    }

    public void swim() {
        System.out.println(name + " " + "Проплыл" + " " + speedSwim);
    }


    public int run(int distance) {
        int time = distance / this.speedRun;
        this.endurance = this.endurance - distance;
        if (endurance < 0) {
            System.out.println(name + " Устал");
            return -1;
        } else {
            System.out.println(name + " Пробежал");
            return time;
        }
    }

    public abstract int swim(int distance);
}