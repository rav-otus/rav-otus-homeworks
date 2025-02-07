package homework.four;

public class MainForBox {
    public static void main(String[] args){
        Box box1 = new Box(5, "Yellow");
        box1.open();
        box1.addElement("Pen");
        box1.close();
        box1.addElement("Ball");
        box1.open();
        box1.addElement("Ball");
        box1.addElement("Picture");

        box1.info();
        box1.close();
        box1.deleteElement();
        box1.info();
        box1.open();
        box1.deleteElement();
        box1.info();
        box1.changeColour("Blue");
        box1.addElement("Picture");
        box1.info();
    }
}
