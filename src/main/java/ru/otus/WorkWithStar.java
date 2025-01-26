package ru.otus;

public class WorkWithStar {
    public static void main(String[] args) {
        int k;
        int array1[] = {1, 5, 4, 6};
        int array2[] = {60, 40, 40};
        int array3[] = {3, 66, 12, 8, 5, 44};

        int[] sumArray = sumOfArray(array1, array2, array3);

        for (k = 0; k < sumArray.length; k++) {
            System.out.print(sumArray[k] + " ");
        }
        System.out.println();

        arrayMiddlePoint(array1);
        arrayIsSorted(false, array1);
        reverseOfArray(array1);
    }

    public static int[] sumOfArray(int[]... args) {
        int i;
        int j;
        int maxArray = 0;

        for (i = 0; i < args.length; i++) {
            if (args[i].length > maxArray) {
                maxArray = args[i].length;
            }
        }
        int[] resultArray = new int[maxArray];
        for (i = 0; i < resultArray.length; i++) {
            resultArray[i] = 0;
        }

        for (i = 0; i < args.length; i++) {
            for (j = 0; j < args[i].length; j++) {
                resultArray[j] = resultArray[j] + args[i][j];
            }
        }

        return resultArray;
    }

    public static void arrayMiddlePoint(int[] array) {
        int i;
        int j;
        int sumLeft = 0;
        int sumRight;

        for (i = 0; i < array.length; i++) {
            sumLeft = sumLeft + array[i];
            sumRight = 0;
            for (j = i + 1; j < array.length; j++) {
                sumRight = sumRight + array[j];
            }
            if (sumLeft == sumRight) {
                System.out.println("Средняя точка массива располагается между " + i + " и " + (i + 1) + " элементами");
                return;
            }
        }
        System.out.println("Средняя точка отсутствует");
    }

    //sortDirect: true - В порядке убывания, false - В порядке возрастания
    public static void arrayIsSorted(boolean sortDirect, int[] array) {
        int i = 0;
        boolean flagSort = false;
        int elem = array[i];
        for (i = 1; i < array.length; i++) {
            if (sortDirect && array[i] > elem) {
                flagSort = false;
                break;
            } else if (!sortDirect && array[i] < elem) {
                flagSort = false;
                break;
            }
            flagSort = true;
            elem = array[i];
        }
        if (sortDirect && flagSort) {
            System.out.println("Массив отсортирован в порядке убывания");
        } else if (!sortDirect && flagSort) {
            System.out.println("Массив отсортирован в порядке возрастания");
        } else if (sortDirect && !flagSort) {
            System.out.println("Массив НЕ отсортирован в порядке убывания");
        } else if (!sortDirect && !flagSort) {
            System.out.println("Массив НЕ отсортирован в порядке возрастания");
        }
    }

    public static void reverseOfArray(int[] array) {
        int i;
        int j;
        int tmpValue;
        for (i = 0; i < (int) (array.length / 2); i++) {
            tmpValue = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = tmpValue;
        }
        System.out.print("Реверс массива: ");
        for (j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }
}
