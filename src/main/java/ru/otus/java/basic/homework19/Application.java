package ru.otus.java.basic.homework19;

import ru.otus.java.basic.homework19.Fruit.Apple;
import ru.otus.java.basic.homework19.Fruit.Orange;
import ru.otus.java.basic.homework19.box.Box;

public class Application {
    public static class Main {
        public static void main(String[] args) {

            Box<Apple> appleBox = new Box<>();
            Box<Orange> orangeBox = new Box<>();

            appleBox.addFruit(new Apple(1.2));
            appleBox.addFruit(new Apple(1.1));
            orangeBox.addFruit(new Orange(1.5));
            orangeBox.addFruit(new Orange(1.3));

            System.out.println("Вес коробки с яблоками: " + appleBox.weight());
            System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());

            System.out.println("Коробки одинаковы по весу? " + appleBox.compare(orangeBox));

            appleBox.transferFruitsTo(orangeBox);
            System.out.println("После пересыпания фруктов:");
            System.out.println("Вес коробки с яблоками: " + appleBox.weight());
            System.out.println("Вес коробки с апельсинами: " + orangeBox.weight());
        }
    }

}
