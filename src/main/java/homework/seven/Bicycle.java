package homework.seven;

public class Bicycle implements Motion{
    public Bicycle(){}

    @Override
    public boolean move(Terrain terrain, int distance){
        if(terrain==Terrain.SWAMP){
            System.out.println("Проехать на велосипеде не получится");
            return false;
        }
        System.out.println("Поездка на велосипеде удалась");
        return true;
    }
}
