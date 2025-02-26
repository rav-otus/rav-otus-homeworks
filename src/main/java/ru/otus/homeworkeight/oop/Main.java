package ru.otus.homeworkeight.oop;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        int sumarr = 0;
        arr[0] = new String[]{"1", "5", "3", "1"};
        arr[1] = new String[]{"12", "4", "9", "5"};
        arr[2] = new String[]{"1", "2", "30", "47"};
        arr[3] = new String[]{"10", "25", "35", "50"};

        try {
            sumarr = sumArray(arr);
        } catch (AppArraySizeException e) {
            System.out.println(e.getMessage());
            sumarr = -1;
        } catch (AppArrayDataException e) {
            System.out.println(e.getMessage());
            sumarr = -1;
        }

        if (sumarr != -1) {
            System.out.println("Сумма элементов массива = " + sumarr);
        }
    }

    public static int sumArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4) {
            throw new AppArraySizeException("Размер массива некорректный");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                char[] chararray = array[i][j].toCharArray();
                for (int k = 0; k < chararray.length; k++) {
                    if ((int) chararray[k] < 48 || (int) chararray[k] > 57) {
                        throw new AppArrayDataException("В строке " + i + " столбце " + j + " лежит не число");
                    }
                }
                sum += Integer.parseInt(array[i][j]);
            }
        }
        return sum;
    }
}
