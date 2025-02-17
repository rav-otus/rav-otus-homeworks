package homework.seven;

public class Application {
    public static void main(String[] args){
        Person person = new Person("Jack", 100);
        Motion car = new Car(200);
        Motion bicycle = new Bicycle();
        Motion horse = new Horse(150);
        Motion rover = new Rover(200);

        person.setCurrentTransport(car);
        person.move(Terrain.DENSE_FOREST, 10);
        person.setCurrentTransport(bicycle);
        person.move(Terrain.DENSE_FOREST, 10);
        System.out.println("У "+person.getName()+" осталось сил: "+ person.getStrength());

        person.setCurrentTransport(null);
        person.move(Terrain.PLAIN, 20);
        System.out.println("У "+person.getName()+" осталось сил: "+ person.getStrength());

        person.setCurrentTransport(rover);
        person.move(Terrain.SWAMP, 201);
    }
}
