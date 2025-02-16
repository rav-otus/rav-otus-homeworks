package homework.seven;

public class Application {
    public static void main(String[] args){
        Person person = new Person("Jack", 100);
        Car car = new Car(200);
        Bicycle bicycle = new Bicycle();
        Horse horse = new Horse(150);
        Rover rover = new Rover(200);

        person.currentTransport = car;
        person.move(Terrain.DENSE_FOREST, 10);
        person.currentTransport = bicycle;
        person.move(Terrain.DENSE_FOREST, 10);
    }
}
