package ru.otus.java.basic.homework4.box;

public class Box {
    private int length;
    private int width;
    private int height;
    private String color;
    private boolean isOpen;
    private String item;

    public Box(int length, int width, int height, String color, boolean isOpen, String item) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpen = isOpen;
        this.item = item;
    }

    public void open() {
        isOpen = true;
    }

    public void close() {
        isOpen = false;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Размеры коробки:\n" + "длина - " + length + ", ширина - " + width + ", высота - " + height);
        System.out.println("Цвет коробки: " + color);
        if (isOpen) {
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка закрыта");
        }
        if (item == null) {
            System.out.println("Коробка пустая");

        } else {
            System.out.println("В коробке лежит: " + item);
        }
    }

    public void putItem(String item) {
        if (isOpen == false) {
            System.out.println("Коробка закрыта, нельзя положить предмет");
        } else if (this.item != null) {
            System.out.println("Коробка заполнена, нельзя положить здесь");
        } else {
            this.item = item;
            System.out.println(item + " положили в коробку");
        }
    }

    public void clear() {
        if (isOpen == false) {
            System.out.println("Коробка закрыта, нельзя вытащить предмет");
        } else if (this.item == null) {
            System.out.println("Коробка пустая");
        } else {
            this.item = null;
            System.out.println(item + " достали из коробки");
        }
    }
}
