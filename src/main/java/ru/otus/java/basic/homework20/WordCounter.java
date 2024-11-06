package ru.otus.java.basic.homework20;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WordCounter {

    private static final String FILE_DIRECTORY = "D:\\Свои проекты\\javaTraining\\java-basic-homeworks\\target\\";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileName;
            String filePath;
            File file;

            while (true) {
                System.out.println("Введите имя файла (например, 1.txt):");
                fileName = reader.readLine();
                filePath = FILE_DIRECTORY + fileName;


                file = new File(filePath);
                if (file.exists()) {
                    break;
                } else {
                    System.out.println("Ошибка: файл " + filePath + " не существует. Попробуйте снова.");
                }
            }

            System.out.println("Введите искомую последовательность символов:");
            String searchString = reader.readLine();


            int count = countOccurrences(filePath, searchString);


            System.out.println("Количество вхождений строки \"" + searchString + "\": " + count);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении данных: " + e.getMessage());
        }
    }


    public static int countOccurrences(String fileName, String searchString) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String line;

            while ((line = br.readLine()) != null) {

                count += countInLine(line, searchString);
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return count;
    }


    public static int countInLine(String line, String searchString) {
        int count = 0;
        int index = 0;


        while ((index = line.indexOf(searchString, index)) != -1) {
            count++;
            index += searchString.length();
        }

        return count;
    }
}
