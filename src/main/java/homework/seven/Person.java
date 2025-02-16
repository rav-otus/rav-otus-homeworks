package homework.seven;

public class Person implements Motion{
    String name;
    int strength;
    Transport currentTransport;

    public Person(String name, int strength){
        this.name = name;
        this.strength = strength;
        this.currentTransport = null;
    }

    @Override
    public boolean move(Terrain terrain, int distance){
        if (currentTransport == null) {
            strength -= distance;
            System.out.println("Прошли пешком");
            return true;
        }
        if (currentTransport instanceof Bicycle){
            strength -= distance;
        }
        return currentTransport.move(terrain, distance);
    }
}

