package ru.otus.java.basic.homework19.box;

import ru.otus.java.basic.homework19.Fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;

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

    public void transferFruitsTo(Box<T> otherBox) {
        if (otherBox.equals(this)) {
            throw new RuntimeException("Не можем пересыпать в ту же коробку");
        }
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}