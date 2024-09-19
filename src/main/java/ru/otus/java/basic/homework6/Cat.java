package ru.otus.java.basic.homework6;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.println(name + " не голоден");
            return;
        }
        if (plate.removeFood(appetite)) {
            satiety = true;
            System.out.println(name + " поел");
        } else {
            System.out.println(name + " не хватило еды в тарелке");
        }
    }

    public void info() {
        System.out.println(name + (satiety ? " сытый" : " голодный"));
    }
}
