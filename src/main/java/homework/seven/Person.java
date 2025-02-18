package homework.seven;

public class Person implements Motion {
    private String name;
    private int strength;
    private Motion currentTransport;

    public Person(String name, int strength) {
        this.name = name;
        this.strength = strength >= 0 ? strength : Math.abs(strength);
        this.currentTransport = null;
    }

    public void setCurrentTransport(Motion currentTransport) {
        this.currentTransport = currentTransport;
    }

    public int getStrength() {
        return strength;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (distance < 0) {
            System.out.println("Дистанция должно быть положительным числом");
            return false;
        }
        if (currentTransport == null) {
            strength -= distance;
            System.out.println("Прошли пешком");
            return true;
        }
        if (currentTransport instanceof Bicycle) {
            strength -= distance;
        }
        return currentTransport.move(terrain, distance);
    }
}

