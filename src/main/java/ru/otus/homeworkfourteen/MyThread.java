package ru.otus.homeworkfourteen;

public class MyThread extends Thread {
    double[] array;
    int begin;
    int end;

    @Override
    public void run() {
        for (int i = begin; i <= end; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public MyThread(double[] array, int begin, int end) {
        this.array = array;
        this.begin = begin;
        this.end = end;
    }
}
