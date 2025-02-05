package ru.otus;

import java.util.Arrays;

public class HomeWorkThree {
    public static void main(String[] args) {
        int squareSize = 5;
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 8, -5, -9}, {7, 6, -5, 4}, {1, 2, 3, 4}};
        int[][] arrWithoutSecondRow = new int[][]{{1, 2, 3, 4}};
        int[][] arrWithSecondRow = new int[][]{{1, 2, 3, 4}, {5 ,6, 7, 2}};

        System.out.println("Сумма положительных элементов равна: " + sumOfPositiveElements(arr));
        squareFromStar(squareSize);
        zeroDiagArray(arr);
        System.out.println();
        System.out.println("Максимальный элемент массива равен: " + findMax(arr));
        System.out.println();
        System.out.println("Сумма элементов второй строки массива, у которого только одна строка: " + sumOfSecondRow(arrWithoutSecondRow));
        System.out.println("Сумма элементов второй строки массива, у которого две строки " + sumOfSecondRow(arrWithSecondRow));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void squareFromStar(int size) {
        System.out.println("Квадрат размером " + size + " на " + size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void zeroDiagArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j || j == array[i].length - i - 1) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = array[i][j];
                }
            }
        }

        System.out.println("Массив с обнулёнными диагоналями:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                max = Math.max(max, array[i][j]);
            }
        }
        return max;
    }

    public static int sumOfSecondRow(int[][] array) {
        int sum = 0;
        if (array.length < 2) {
            return -1;
        }
        for (int i = 0; i < array[1].length; i++) {
            sum += array[1][i];
        }
        return sum;
    }
}

