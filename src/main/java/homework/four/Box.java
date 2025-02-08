package homework.four;

public class Box {
    private int size;
    private String colour;
    private String element;
    private boolean isOpened;

    public Box(int size, String colour){
        this.size = size;
        this.colour = colour;
        this.element = null;
        this.isOpened = false;
    }

    public void changeColour(String colour) {
        this.colour = colour;
        System.out.println("Коробка теперь имеет цвет "+this.colour);
    }

    public void open(){
        if(!isOpened){
            this.isOpened = true;
            System.out.println("Коробка открыта");
        }else{
            System.out.println("Коробрка уже открыта");
        }
    }

    public void close(){
        if(isOpened){
            this.isOpened = false;
            System.out.println("Коробка закрыта");
        }else{
            System.out.println("Коробрка уже закрыта");
        }
    }

    public void addElement(String element){
        if (!isOpened){
            System.out.println("Добавить предмет не получится, так как коробка закрыта");
            return;
        }
        if(this.element ==null) {
            this.element = element;
            System.out.println("Предмет " + element + " добавлен в коробку");
        }else {
            System.out.println("В коробке уже есть предмет");
        }
    }

    public void deleteElement(){
        if (!isOpened){
            System.out.println("Удалить предмет не получится, так как коробка закрыта");
            return;
        }
        if(this.element != null) {
            String deletedElement = this.element;
            this.element = null;
            System.out.println("Предмет " + deletedElement + " удален из коробки");
        }else {
            System.out.println("Удалять нечего, так как коробка пуста");
        }
    }

    public void info(){
        String openedClosed;
        if(isOpened){
            openedClosed = "Открыта";
        }else{
            openedClosed = "Закрыта";
        }
        System.out.println();
        System.out.println("Коробка цвета "+colour+" , размера "+ size+" в данный момент "+openedClosed);
        if(element != null) {
            System.out.println("Содержит предмет " + element);
        }else{
            System.out.println("Коробка пуста");
        }
        System.out.println();
    }
}

