package homework.six;

public class Main {
    public static void main(String[] args){
        Plate plate;
        Cat [] cats = new Cat[3];

        plate = new Plate(100);
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Мурзик", 20);
        cats[2] = new Cat("Кузя", 50);

        cats[0].eat(plate);
        cats[1].eat(plate);
        cats[2].eat(plate);

        plate.addFood(20);

        for(int i=0;i<cats.length;i++){
            cats[i].state();
        }
    }
}
