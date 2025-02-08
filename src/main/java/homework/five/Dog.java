package homework.five;

public class Dog extends Animal {
    int sweemSpeed;
    public Dog(String name, int endurance, int runSpeed, int sweemSpeed) {
        super(name, endurance, runSpeed);
        this.sweemSpeed = sweemSpeed;
    }

    public float sweem(int distance){
        if(endurance - distance*2<0){
            System.out.println("Животное устало и плыть не может");
            return -1;
        }
        endurance -= distance*2;
        float time = (float)distance/sweemSpeed;
        System.out.println("Животное проплыло "+distance+" метров за "+ time + " секунд."+" Оставшаяся выносливость: "+ endurance);
        return float;
    }
}
