package ru.otus.java.basic.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileApp {
    private static final String DIRECTORY_PATH = ""; // Корневой каталог проекта

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        List<Path> textFiles = listTextFiles();
        if (textFiles.isEmpty()) {
            System.out.println("В корневом каталоге нет текстовых файлов.");
            return;
        }
        System.out.println("Список текстовых файлов:");
        textFiles.forEach(path -> System.out.println(path.getFileName()));

        System.out.print("Введите имя файла для работы: ");
        String fileName = scanner.nextLine();
        Path filePath = Paths.get(DIRECTORY_PATH, fileName);

        if (!Files.exists(filePath)) {
            System.out.println("Файл не найден.");
            return;
        }

        displayFileContent(filePath);

        System.out.println("Введите строки для записи в файл (введите 'exit' для завершения):");
        try (PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(filePath.toFile(), true), StandardCharsets.UTF_8))) {
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.println(line);  // Используем println для новой строки
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }

        System.out.println("Запись завершена.");
    }

    private static List<Path> listTextFiles() {
        try {
            return Files.list(Paths.get(FileApp.DIRECTORY_PATH))
                    .filter(path -> path.toString().endsWith(".txt"))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Ошибка при получении списка файлов: " + e.getMessage());
            return List.of();
        }
    }

    private static void displayFileContent(Path filePath) {
        System.out.println("\nСодержимое файла:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath.toFile()), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
