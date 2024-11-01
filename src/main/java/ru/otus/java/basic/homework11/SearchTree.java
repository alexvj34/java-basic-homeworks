package ru.otus.java.basic.homework11;

import java.util.List;

public interface SearchTree<T> {
    T find(T element);
    List<T> getSortedList();
}
