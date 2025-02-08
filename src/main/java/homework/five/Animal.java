package homework.five;

public class Animal {
    String name;
    int runSpeed;
    int endurance;

    public Animal(String name, int endurance, int runSpeed){
        this.name = name;
        this.endurance = endurance;
        this.runSpeed = runSpeed;
    }

    public float run(int distance){
        if(endurance - distance<0){
            System.out.println("Животное устало и бежать не может");
            return -1;
        }
        endurance -= distance;
        float time = (float)distance/runSpeed;
        System.out.println("Животное пробежало "+distance+" метров за "+ time + " секунд."+" Оставшаяся выносливость: "+ endurance);
        return float;
    }
}
