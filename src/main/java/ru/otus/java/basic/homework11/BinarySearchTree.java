package ru.otus.java.basic.homework11;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements SearchTree<T> {
    private TreeNode<T> root;

    // Метод для формирования дерева из отсортированного списка
    public BinarySearchTree(List<T> sortedList) {
        root = buildTreeFromSortedList(sortedList, 0, sortedList.size() - 1);
    }

    // Рекурсивный метод для формирования сбалансированного дерева из отсортированного списка
    private TreeNode<T> buildTreeFromSortedList(List<T> sortedList, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode<T> node = new TreeNode<>(sortedList.get(mid));
        node.left = buildTreeFromSortedList(sortedList, start, mid - 1);
        node.right = buildTreeFromSortedList(sortedList, mid + 1, end);

        return node;
    }

    // Реализация метода поиска элемента в дереве
    @Override
    public T find(T element) {
        return findRecursive(root, element);
    }

    private T findRecursive(TreeNode<T> node, T element) {
        if (node == null) return null;
        int compare = element.compareTo(node.value);
        if (compare == 0) return node.value;
        else if (compare < 0) return findRecursive(node.left, element);
        else return findRecursive(node.right, element);
    }

    // Реализация метода для получения отсортированного списка из дерева
    @Override
    public List<T> getSortedList() {
        List<T> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        return sortedList;
    }

    private void inOrderTraversal(TreeNode<T> node, List<T> sortedList) {
        if (node == null) return;
        inOrderTraversal(node.left, sortedList);
        sortedList.add(node.value);
        inOrderTraversal(node.right, sortedList);
    }
}
