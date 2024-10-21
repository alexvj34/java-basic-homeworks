package ru.otus.java.basic.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ignat", 25),
                new Employee("Bogdan", 30),
                new Employee("Alla", 22));

        System.out.println(getEmployeeNames(employees));
        System.out.println(filterByAge(employees, 25));
        System.out.println(isAverageAgeGreaterThan(employees, 26));
        System.out.println(getYoungestEmployee(employees));

    }


    public static ArrayList<Integer> getRange(int min, int max) {
        ArrayList<Integer> rangeList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            rangeList.add(i);
        }
        return rangeList;
    }

    public static int sumGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number > 5) {
                sum += number;
            }
        }
        return sum;
    }

    public static void overwriteList(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    public static void increaseElementsBy(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> filterByAge(List<Employee> employees, int minAge) {
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    public static boolean isAverageAgeGreaterThan(List<Employee> employees, int minAvgAge) {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        double averageAge = (double) totalAge / employees.size();
        return averageAge > minAvgAge;
    }

    public static Employee getYoungestEmployee(List<Employee> employees) {
        if (employees.isEmpty()) {
            return null; // если список пуст
        }
        Employee youngest = employees.get(0);
        for (Employee employee : employees) {
            if (employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }

}

