package ru.otus.java.basic.homework4.users;

import java.time.Year;

public class Main {
    public static void main(String[] args){
        User user = new User("Pupkin", "Vasia","Vasilevich",1980,"vasia@mail.ru");
        User user2 = new User("Ivanov", "Ivan","Ivanovich",1960,"ivan@mail.ru");
        User user3 = new User("Petrov", "Petr","Petrovich",1979,"petr1@mail.ru");
        User user4 = new User("Sergeev", "Sergey","Petrovich",1981,"thisisspartanec@mail.ru");
        User user5 = new User("Eropolkov", "Sviztoslav","Petrovich",2008,"zvezdavshoke@mail.ru");
        User user6 = new User("Kirkorov", "Fillip","Bedrosovich",1961,"pop_king@mail.ru");
        User user7 = new User("Pugacheva", "Alla","Allavna",1943,"staraya@mail.ru");
        User user8 = new User("Ivanova", "Irina","Grogovna",1991,"irina@mail.ru");
        User user9 = new User("Marianovna", "Maria","Vasilevich",2010,"carica@mail.ru");
        User user10 = new User("Pupkin","Vasia", "Vasilevich",1998,"nevasia@mail.ru");

        User[] users = {user,user2,user3,user4,user5,user6,user7,user8,user9,user10};
        for (int i = 0; i < users.length; i++) {
            if (2024 - users[i].getYearOfBirth() > 40){
                users[i].info();
                System.out.println();
            }
        }
    }
}