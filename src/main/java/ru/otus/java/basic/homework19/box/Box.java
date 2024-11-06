package ru.otus.java.basic.homework19.box;

import ru.otus.java.basic.homework19.Fruit.Fruit;
import ru.otus.java.basic.homework19.Fruit.Orange;

import java.util.ArrayList;
import java.util.Collection;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public double weight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return this.weight() == otherBox.weight();
    }

    public void transferFruitsTo(Box<Orange> otherBox) {
        otherBox.fruits.addAll((Collection<? extends Orange>) this.fruits);
        this.fruits.clear();
    }
}