package ru.otus.homeworknine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int min = 2;
        int max = 10;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Employee> Employees = new ArrayList<Employee>();
        ArrayList<Employee> emplOlderThanArg = new ArrayList<Employee>();
        Employees.add(new Employee("John", 25));
        Employees.add(new Employee("Jack", 40));
        Employees.add(new Employee("Jannifer", 18));
        Employees.add(new Employee("Mark", 57));

        list = range(min, max);
        System.out.println("Список: " + list);
        System.out.println("Сумма элементов списка, которые больше 5 равна: " + sumlist(list));
        replaceInList(1, list);
        System.out.println("Список после замены: " + list);
        incremInList(20, list);
        System.out.println("Список после увеличения: " + list);
        System.out.println("Список имен сотрудников: " + listName(Employees));
        emplOlderThanArg = listMoreOldEmpl(Employees, 30);
        isAverageAgeMoreMin(Employees, 30);
        Employee youngestEmployee = youngestEmployee(Employees);
        System.out.println("Самый молодой сотрудник: " + youngestEmployee.getName() + " возрастом " + youngestEmployee.getAge());

    }

    public static ArrayList range(int min, int max) {
        ArrayList<Integer> range = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            range.add(i);
        }
        return range;
    }

    public static int sumlist(ArrayList<Integer> list) {
        int sum = 0;
        if (list.isEmpty()) {
            System.out.println("Входящий список пуст");
            return -1;
        }
        for (int i : list) {
            if (i > 5) {
                sum += i;
            }
        }
        return sum;
    }

    public static void replaceInList(int num, ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Входящий список пуст");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, num);
        }
    }

    public static void incremInList(int num, ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("Входящий список пуст");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + num);
        }
    }

    public static ArrayList<String> listName(ArrayList<Employee> list) {
        ArrayList<String> listname = new ArrayList<String>();
        if (list.isEmpty()) {
            System.out.println("Список сотрудников пуст");
            return null;
        }
        for (Employee emp : list) {
            listname.add(emp.getName());
        }
        return listname;
    }

    public static ArrayList<Employee> listMoreOldEmpl(ArrayList<Employee> list, int agemin) {
        ArrayList<Employee> listmoreold = new ArrayList<Employee>();
        if (list.isEmpty()) {
            System.out.println("Список сотрудников пуст");
            return null;
        }
        for (Employee emp : list) {
            if (emp.getAge() >= agemin) {
                listmoreold.add(emp);
            }
        }
        return listmoreold;
    }

    public static boolean isAverageAgeMoreMin(ArrayList<Employee> list, int minAverageAge) {
        int sumAge = 0;
        boolean isAverageageMoreMin;
        if (list.isEmpty()) {
            System.out.println("Список сотрудников пуст");
            return false;
        }
        if (minAverageAge <= 0) {
            System.out.println("Минимальный средний возраст должен быть больше нуля");
            return false;
        }
        for (Employee emp : list) {
            sumAge += emp.getAge();
        }
        isAverageageMoreMin = sumAge / list.size() > minAverageAge ? true : false;
        System.out.println("Средний возраст сотрудников превышает " + minAverageAge + " : " + isAverageageMoreMin);
        return isAverageageMoreMin;
    }

    public static Employee youngestEmployee(ArrayList<Employee> list) {
        int minAge = 0;
        if (list.isEmpty()) {
            System.out.println("Список сотрудников пуст");
            return null;
        }
        Employee youngest = list.get(0);
        for (Employee emp : list) {
            youngest = emp.getAge() < youngest.getAge() ? emp : youngest;
        }
        return youngest;
    }
}

