package homework.seven;

public class Horse implements Motion {
    int strength;

    public Horse(int strength){
        this.strength = strength;
    }

    @Override
    public boolean move(Terrain terrain, int distance){
        if (terrain == Terrain.SWAMP || strength-distance<0){
            System.out.println("Проехать на лошади не получится");
            return false;
        }
        strength -= distance;
        System.out.println("Поездка удачна. У лошади осталось сил: "+strength);
        return true;
    }
}
