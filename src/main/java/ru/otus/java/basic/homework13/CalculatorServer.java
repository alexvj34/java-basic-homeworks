package ru.otus.java.basic.homework13;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Сервер запущен и ожидает подключения...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Клиент подключился.");

                try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    out.println("Доступные операции: +, -, *, /");

                    String input = in.readLine();
                    if (input != null) {
                        input = input.replaceAll("\\s", "");
                        input = input.replace(",", ".");


                        String[] parts = input.split("(?<=[-+*/])|(?=[-+*/])");
                        if (parts.length != 3) {
                            out.println("Ошибка: неверный формат ввода.");
                            continue;
                        }

                        double num1 = Double.parseDouble(parts[0]);
                        String operation = parts[1];
                        double num2 = Double.parseDouble(parts[2]);
                        double result = 0;

                        switch (operation) {
                            case "+":
                                result = num1 + num2;
                                break;
                            case "-":
                                result = num1 - num2;
                                break;
                            case "*":
                                result = num1 * num2;
                                break;
                            case "/":
                                if (num2 != 0) {
                                    result = num1 / num2;
                                } else {
                                    out.println("Ошибка: деление на ноль.");
                                    continue;
                                }
                                break;
                            default:
                                out.println("Ошибка: неизвестная операция.");
                                continue;
                        }

                        String formattedResult = (result == (int) result) ? String.valueOf((int) result) : String.valueOf(result);
                        out.println("Результат: " + formattedResult);
                    }
                } catch (IOException | NumberFormatException e) {
                    System.out.println("Ошибка при обработке данных клиента: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при запуске сервера: " + e.getMessage());
        }
    }
}