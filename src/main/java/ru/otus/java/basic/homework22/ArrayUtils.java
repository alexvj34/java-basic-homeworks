package ru.otus.java.basic.homework22;

import java.util.Arrays;

public class ArrayUtils {


    public static int[] elementsAfterLastOne(int[] array) {
        int lastOneIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                lastOneIndex = i;
            }
        }
        if (lastOneIndex == -1) {
            throw new RuntimeException("Массив не содержит единиц.");
        }
        return Arrays.copyOfRange(array, lastOneIndex + 1, array.length);
    }


    public static boolean isArrayOneAndTwoOnly(int[] array) {
        boolean containsOne = false;
        boolean containsTwo = false;
        for (int num : array) {
            if (num != 1 && num != 2) {
                return false;
            }
            if (num == 1) {
                containsOne = true;
            }
            if (num == 2) {
                containsTwo = true;
            }
        }
        return containsOne && containsTwo;
    }
}

