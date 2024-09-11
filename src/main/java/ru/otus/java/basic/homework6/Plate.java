package ru.otus.java.basic.homework6;

public class Plate {
    int maxFood;
    int currentFood;

    public Plate(int maxFood) {
        this.currentFood = maxFood;
        this.maxFood = maxFood;
    }

    public void addFood(int food) {
        int result = this.currentFood + food;
        if (result > this.maxFood) {
            this.currentFood = this.maxFood;
        } else {
            this.currentFood = result;
        }

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
