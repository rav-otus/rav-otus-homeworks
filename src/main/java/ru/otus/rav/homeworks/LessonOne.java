package ru.otus.rav.homeworks;

import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {
        int aCheckSign = 0;
        int bCheckSign = 0;
        int cCheckSign = 0;
        int initValueaddOrSubtractAndPrint = 0;
        int deltaaddOrSubtractAndPrint = 0;
        boolean incrementaddOrSubtractAndPrint = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5");
        int method = scanner.nextInt();

        if (method==1){
            greetings();
        } else if (method==2) {
            aCheckSign = (int)(Math.random() * 10);
            bCheckSign = (int)((Math.random() * (-10)));
            cCheckSign = (int)(Math.random() * 10);
            checkSign(aCheckSign, bCheckSign, cCheckSign);
        } else if (method==3) {
            selectColor();
        } else if (method==4) {
            compareNumbers();
        } else if (method==5) {
            initValueaddOrSubtractAndPrint = (int)(Math.random() * 20);
            deltaaddOrSubtractAndPrint = (int)(Math.random() * 20);
            if ((Math.random() * 10)>=5){
                incrementaddOrSubtractAndPrint = false;
            }else
            {
                incrementaddOrSubtractAndPrint = true;
            };
            addOrSubtractAndPrint(initValueaddOrSubtractAndPrint, deltaaddOrSubtractAndPrint, incrementaddOrSubtractAndPrint);
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("From");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void selectColor()  {
        int data;
        data = 20;
        if(data<10){
            System.out.println("Красный");
        } else if (data>=10 && data<20) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers()  {
        int a=0;
        int b= 1;
        if(a>=b){
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue+delta);
        } else {
            System.out.println(initValue-delta);
        }

    }
}