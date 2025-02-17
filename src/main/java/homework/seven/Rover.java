package homework.seven;

public class Rover implements Motion{
    int fuel;

    public Rover(int fuel){
        this.fuel = fuel;
    }

    @Override
    public boolean move(Terrain terrain, int distance){
        if (fuel-distance<0){
            System.out.println("Воспользоваться вездеходом не получится. Не хватает топлива");
            return false;
        }
        fuel -= distance;
        System.out.println("Поездка успешна. У вездехода осталось топлива: "+fuel);
        return true;
    }
}
