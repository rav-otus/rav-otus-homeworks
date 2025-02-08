package homework.five;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 100, 2);
        Dog dog1 = new Dog("Шарик", 200, 5, 1);
        Horse horse1 = new Horse("Жеребец", 300, 10, 2);

        cat1.run(95);
        dog1.run(100);
        horse1.run(100);

        cat1.info();
        dog1.info();
        horse1.info();

        cat1.run(1);

        dog1.swim(10);
        horse1.swim(20);
        dog1.swim(1000);
    }
}
