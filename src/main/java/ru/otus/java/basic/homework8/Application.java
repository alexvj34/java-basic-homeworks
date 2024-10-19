package ru.otus.java.basic.homework8;

public class Application {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "seven", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        try {
            int sum = sumElementsArray(correctArray);
            System.out.printf("Сумма элементов массива: %d%n", sum);

            sumElementsArray(incorrectSizeArray);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }

        try {
            sumElementsArray(invalidDataArray);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static int sumElementsArray(String[][] array) throws AppArraySizeException, AppArrayDataException {

        if (array.length != 4) {
            throw new AppArraySizeException("Неверное количество строк в массиве, ожидалось 4");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new AppArraySizeException("Неверное количество столбцов в массиве, ожидалось 4");
            }
        }

        int sum = 0;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка в данных массива: ячейка [" + i + "][" + j + "] содержит неверные данные");
                }
            }
        }

        return sum;
    }
}