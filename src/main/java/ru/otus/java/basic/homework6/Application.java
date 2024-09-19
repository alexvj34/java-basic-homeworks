package ru.otus.java.basic.homework6;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 100), new Cat("Pizhik", 70), new Cat("Murzik", 80)};
        Plate plate = new Plate(200);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        for (Cat cat : cats) {
            cat.info();
        }
    }

}
