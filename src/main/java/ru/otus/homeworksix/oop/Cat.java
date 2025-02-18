package ru.otus.homeworksix.oop;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        if (appetite < 0) {
            appetite = Math.abs(appetite);
        }
        this.appetite = appetite;
        this.name = name;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(this.appetite);
        if (satiety) {
            System.out.println("Кот " + name + " наелся");
            return;
        }
        System.out.println("Кот " + name + " остался голодный");
    }

    public void printState() {
        if (satiety) {
            System.out.println(name + " сыт");
            return;
        }
        System.out.println(name + " голодный");
    }
}
