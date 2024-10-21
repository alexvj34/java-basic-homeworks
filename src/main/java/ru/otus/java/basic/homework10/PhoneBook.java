package ru.otus.java.basic.homework10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {


    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void add(String name, String phoneNumber) {

        phoneBook.computeIfAbsent(name, k -> new HashSet<>()).add(phoneNumber);
    }


    public Set<String> find(String name) {
        return phoneBook.getOrDefault(name, new HashSet<>());
    }


    public boolean containsPhoneNumber(String phoneNumber) {
        for (Set<String> phoneNumbers : phoneBook.values()) {
            if (phoneNumbers.contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
