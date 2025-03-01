package ru.otus.homeworknine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

    }

    public ArrayList range(int min, int max){
        ArrayList<Integer> range = null;
        for (int i=min; i<=max; i++){
            range.add(i);
        }
        return range;
    }

    public int sumlist(ArrayList<Integer> list){
        int sum=0;
        for(int i:list){
            if(i>5){
                sum += i;
            }
        }
        return sum;
    }

    public void replaceInList(int num, ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            list.set(i, num);
        }
    }

    public void incremInList(int num, ArrayList<Integer> list){
        for(int i=0; i<list.size(); i++){
            list.set(i, list.get(i) + num);
        }
    }

    public ArrayList<String> listName(ArrayList<Employee> list){
        ArrayList<String> listname = null;
        if (list.isEmpty()){
            System.out.println("Список сотрудников пуст");
            return null;
        }
        for (Employee emp: list){
            listname.add(emp.getName());
        }
        return listname;
    }

    public ArrayList<Employee> listMoreOldEmpl(ArrayList<Employee> list, int agemin){
        ArrayList<Employee> listmoreold = null;
        if (list.isEmpty()){
            System.out.println("Список сотрудников пуст");
            return null;
        }
        for (Employee emp: list){
            if(emp.getAge()>=agemin){
                listmoreold.add(emp);
            }
        }
        return listmoreold;
    }

    public boolean isAverageAgeMoreMin(ArrayList<Employee> list, int minAverageAge){
        int sumAge=0;
        boolean isAverageageMoreMin;
        if (list.isEmpty()){
            System.out.println("Список сотрудников пуст");
            return false;
        }
        if (minAverageAge<=0){
            System.out.println("Минимальный средний возраст должен быть боьше нуля");
            return false;
        }
        for(Employee emp:list){
                sumAge += emp.getAge();
        }
        isAverageageMoreMin = sumAge/list.size() > minAverageAge ? true : false;
        return isAverageageMoreMin;
    }

    public Employee youngestEmployee(ArrayList<Employee> list){
        int minAge = 0;
        if (list.isEmpty()){
            System.out.println("Список сотрудников пуст");
            return null;
        }
        Employee youngest = list.get(0);
        for(Employee emp:list){
            youngest = emp.getAge()<youngest.getAge() ? emp : youngest;
        }
        return youngest;
    }
}

