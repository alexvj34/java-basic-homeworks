package ru.otus.java.basic.homework4.users;


public class User {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private int yearOfBirth;
    private String mail;

    public User(String lastName, String firstName, String patronymicName,int yearOfBirth, String mail){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymicName = patronymicName;
        this.yearOfBirth = yearOfBirth;
        this.mail = mail;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void info(){
        System.out.println("ФИО: "+ lastName +" "+ firstName +" "+ patronymicName +"\nГод рождения: "+ yearOfBirth +"\ne-mail: "+ mail);
    }
}
