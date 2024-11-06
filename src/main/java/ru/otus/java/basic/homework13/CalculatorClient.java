package ru.otus.java.basic.homework13;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            String serverMessage = in.readLine();
            System.out.println(serverMessage);

            System.out.print("Введите выражение (например, 5 + 3): ");
            String userInput = scanner.nextLine();
            out.println(userInput);

            String response = in.readLine();
            System.out.println("Ответ от сервера: " + response);

        } catch (IOException e) {
            System.out.println("Ошибка при подключении к серверу: " + e.getMessage());
        }
    }
}
