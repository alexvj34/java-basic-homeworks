package ru.otus.java.basic.homework1;

import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        byte operation;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите число от 1 до 5");
            operation = scanner.nextByte();
            if (operation == 1) {
                greetings();
            } else if (operation == 2) {
                int a = new Random().nextInt();
                int b = new Random().nextInt();
                int c = new Random().nextInt();
                checkSign(a, b, c);
            } else if (operation == 3) {
                selectColor();
            } else if (operation == 4) {
                compareNumbers();
            } else if (operation == 5) {
                int initValue = new Random().nextInt();
                int delta = new Random().nextInt();
                boolean increment = new Random().nextBoolean();
                addOrSubtractAndPrint(initValue, delta, increment);
            } else {
                System.out.println("Вы выбрали не верное число");
            }
        } while (operation > 5);
    }

    public static void greetings() {
        System.out.println("\nHello, \nWorld, \nfrom, \nJava");
        int[] emojiArray = {0x1F600, 0x1F60E, 0x1F604, 0x1F60D, 0x1F606, 0x1F605, 0x1F923, 0x1F63A};

        int randomNumber = new Random().nextInt(emojiArray.length);
        System.out.println(Character.toString(emojiArray[randomNumber]));
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 30);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 20) {
            System.out.println("Зеленый");
        } else {
            System.out.println("Желтый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 50);
        int b = (int) (Math.random() * 12);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            int result = initValue + delta;
            System.out.println(result);
        } else {
            int result = initValue - delta;
            System.out.println(result);
        }
    }
}
