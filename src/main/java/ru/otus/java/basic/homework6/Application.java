package ru.otus.java.basic.homework6;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 100), new Cat("Pizhik", 70), new Cat("Murzik", 80)};
        Plate plate = new Plate(200);
        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);
        cats[0].info();
        cats[1].info();
        cats[2].info();
    }

}
