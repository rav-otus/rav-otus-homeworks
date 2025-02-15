package homework.six;

public class Plate {
    int maxFood;
    int currentFood;

    public Plate(int maxFood){
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public void addFood(int food){
        this.currentFood = Math.min(food,maxFood);
    }

    public boolean decreaseFood(int food){
        if ((this.currentFood-food) >= 0) {
            this.currentFood -= food;
            return true;
        }
        return false;
    }
}
