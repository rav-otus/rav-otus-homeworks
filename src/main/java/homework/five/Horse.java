package homework.five;

public class Horse extends Animal {
    private float swimSpeed;

    public Horse(String name, int endurance, float runSpeed, float swimSpeed) {
        super(name, endurance, runSpeed);
        this.swimSpeed = swimSpeed;
    }

    public float swim(int distance) {
        if (endurance - distance * 4 < 0) {
            System.out.println("Животное " + name + " устало и плыть не может");
            return -1;
        }
        endurance -= distance * 4;
        float time = (float) distance / swimSpeed;
        System.out.println("Животное проплыло " + distance + " метров за " + time + " секунд." + " Оставшаяся выносливость: " + endurance);
        return time;
    }
}
