package ru.otus.homeworksix.oop;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int amount) {
        if (amount < 0) {
            System.out.println("Количество еды должно быть положительным. " + "В тарелке " + currentFood + " еды");
            return;
        }
        currentFood += Math.min(amount, maxFood);
        System.out.println("В тарелке " + currentFood + " еды");
    }

    public boolean decreaseFood(int amount) {
        if (amount < 0) {
            return false;
        }
        if ((currentFood - amount) >= 0) {
            currentFood -= amount;
            return true;
        }
        return false;
    }
}
