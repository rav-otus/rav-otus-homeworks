package ru.otus.rav;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        int countOfPrint = 3;
        int fillByNum = 10;
        int incrNum = 5;
        int[] inputArray = {5, 7, 5, 7};
        String inpString = "Строка для печати";

        printString(countOfPrint, inpString);
        sumOfArrayOfElemMoreFive(inputArray);
        fillArrayByNum(fillByNum, inputArray);
        incrEveryElemArrayOnNum(incrNum, inputArray);
        whatHalOfArrayfMore(inputArray);

    }

    public static void whatHalOfArrayfMore(int[] array) {
        int i;
        int sum1 = 0;
        int sum2 = 0;
        for (i = 0; i < (int) (array.length / 2); i++) {
            sum1 = sum1 + array[i];
        }
        int middleElem = 0;
        if (array.length % 2 == 0) {
            middleElem = array.length / 2;
        } else {
            middleElem = (int) (array.length / 2) + 1;
        }
        for (i = middleElem; i < array.length; i++) {
            sum2 = sum2 + array[i];
        }
        if (sum1 > sum2) {
            System.out.println("Левая половина больше правой");
        } else if (sum2 > sum1) {
            System.out.println("Правая половина больше левой");
        } else System.out.println("Половины равны");
    }

    public static void incrEveryElemArrayOnNum(int incrNum, int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = array[i] + incrNum;
        }
    }

    public static void fillArrayByNum(int fillWithNum, int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = fillWithNum;
        }
    }

    public static void sumOfArrayOfElemMoreFive(int[] array) {
        int i;
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                sum = sum + array[i];
            }
        }
        System.out.println("Сумма элементов массива больше 5 равна " + sum);
    }

    public static void printString(int count, String inputString) {
        int i;
        for (i = 1; i <= count; i++) {
            System.out.println(inputString);
        }
    }

}
