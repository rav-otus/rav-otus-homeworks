package homework.seven;

public class Bicycle extends Transport implements Motion{
    public Bicycle(){}

    @Override
    public boolean move(Terrain terrain, int distance){
        if(terrain==Terrain.SWAMP){
            System.out.println("Воспользоваться велосипедом не получится");
            return false;
        }
        System.out.println("Поездка удалась");
        return true;
    }
}
