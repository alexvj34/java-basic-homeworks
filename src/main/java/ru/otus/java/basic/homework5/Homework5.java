package ru.otus.java.basic.homework5;


import ru.otus.java.basic.homework5.animals.Cat;
import ru.otus.java.basic.homework5.animals.Dog;
import ru.otus.java.basic.homework5.animals.Horse;

public class Homework5 {
    public static void main(String[] args) {
        int distance = 10;
        Cat cat = new Cat("Barsik", 30, 5, 50);
        Dog dog = new Dog("Bobik", 50, 10, 80);
        Horse horse = new Horse("Plotva", 100, 30, 100);


        cat.run(distance);
        dog.run(distance);
        horse.run(distance);
        cat.swim(distance);
        dog.swim(distance);
        horse.swim(distance);
        cat.info();
        dog.info();
        horse.info();

    }

}