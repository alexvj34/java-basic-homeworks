package ru.otus.java.basic.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        byte operation;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите число от 1 до 5");
            operation = scanner.nextByte();
            if (operation == 1) {
                conclusion(5, "Java Basic");
            } else if (operation == 2) {
                int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
                sumElementMoreFive(arr);
            } else if (operation == 3) {
                int[] fillArr = new int[10];
                fillArray(15, fillArr);
                System.out.println(Arrays.toString(fillArr));
            } else if (operation == 4) {
                int[] arrChange = {12, 45, 32, 89};
                changeArray(7, arrChange);
                System.out.println(Arrays.toString(arrChange));
            } else if (operation == 5) {
                int[] leftRight = {10, 12, 4, 5, 2, 2, 1};
                leftRight(leftRight);
            } else {
                System.out.println("Вы выбрали не верное число");
            }
        } while (operation > 5);
    }

    public static void conclusion(int count, String message) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }

    }

    public static void sumElementMoreFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number;
        }
    }

    public static void changeArray(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += number;
        }
    }

    public static void leftRight(int[] arr) {
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumRight += arr[i];
        }
        if (sumLeft < sumRight) {
            System.out.println("Правая половина больше");
        } else if (sumLeft > sumRight) {
            System.out.println("Правая половина мельше");
        } else {
            System.out.println("Обе половины массива равны");
        }
    }
}
