package ru.otus.java.basic.homework11;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static class Main {
        public static void main(String[] args) {
            List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
            BinarySearchTree<Integer> bst = new BinarySearchTree<>(sortedList);

            // Поиск элемента
            Integer result = bst.find(4);
            System.out.println("Найден элемент: " + (result != null ? result : "не найден"));

            // Получение отсортированного списка
            List<Integer> sortedTreeList = bst.getSortedList();
            System.out.println("Элементы дерева в отсортированном порядке: " + sortedTreeList);
        }
    }
}
