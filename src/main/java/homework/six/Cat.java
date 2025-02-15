package homework.six;

public class Cat {
    String name;
    int appetite;
    boolean satiety;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate){
        this.satiety = plate.decreaseFood(this.appetite);
        if (this.satiety){
            System.out.println("Кот "+this.name+" наелся");
            return;
        }
        System.out.println("Кот "+this.name+" остался голодный");
    }

    public void state(){
        if(satiety){
            System.out.println(name+" сыт");
            return;
        }
        System.out.println(name+" голодный");
    }
}
