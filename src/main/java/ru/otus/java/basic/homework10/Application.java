package ru.otus.java.basic.homework10;

public class Application {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Иван Иванов", "123456");
        phoneBook.add("Иван Иванов", "654321");
        phoneBook.add("Мария Петрова", "987654");


        System.out.println("Телефоны Иван Иванов: " + phoneBook.find("Иван Иванов"));
        System.out.println("Телефоны Мария Петрова: " + phoneBook.find("Мария Петрова"));


        System.out.println("Номер 123456 существует: " + phoneBook.containsPhoneNumber("123456"));
        System.out.println("Номер 000000 существует: " + phoneBook.containsPhoneNumber("000000"));
    }
}
