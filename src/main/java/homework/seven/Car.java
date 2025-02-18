package homework.seven;

public class Car implements Motion {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel >= 0 ? fuel : Math.abs(fuel);
    }

    @Override
    public boolean move(Terrain terrain, int distance) {
        if (terrain == Terrain.DENSE_FOREST || terrain == Terrain.SWAMP || fuel - distance < 0) {
            System.out.println("Проехать на машине не получится");
            return false;
        }
        fuel -= distance;
        System.out.println("Поездка удачна. У машины осталось топлива: " + fuel);
        return true;
    }
}
