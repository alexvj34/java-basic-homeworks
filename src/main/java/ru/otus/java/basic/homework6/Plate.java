package ru.otus.java.basic.homework6;

public class Plate {
    int maxFood;
    int currentFood;

    public Plate(int maxFood) {
        this.currentFood = maxFood;
        this.maxFood = maxFood;
    }

    public void addFood(int food) {
        this.currentFood = Math.min(this.currentFood + food, this.maxFood);

    }

    public boolean removeFood(int food) {
        int result = this.currentFood - food;
        if (result >= 0) {
            this.currentFood = result;
            return true;
        } else {
            return false;
        }
    }
}
