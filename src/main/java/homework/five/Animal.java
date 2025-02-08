package homework.five;

public class Animal {
    String name;
    float runSpeed;
    int endurance;

    public Animal(String name, int endurance, float runSpeed) {
        this.name = name;
        this.endurance = endurance;
        this.runSpeed = runSpeed;
    }

    public float run(int distance) {
        if (endurance - distance < 0) {
            System.out.println("Животное " + name + " устало и бежать не может");
            return -1;
        }
        endurance -= distance;
        float time = (float) (distance) / runSpeed;
        System.out.println("Животное " + name + " пробежало " + distance + " метров за " + time + " секунд." + " Оставшаяся выносливость: " + endurance);
        return time;
    }

    public void info() {
        System.out.println("У животного " + name + " осталось выносливости: " + endurance + " единиц");

    }
}
