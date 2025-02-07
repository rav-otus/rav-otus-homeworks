package homework.four;

import java.util.Formatter;

public class User {
    private String family;
    private String name;
    private String secondName;
    private int birhtYear;
    private String email;

    public User(String family, String name, String secondName, int birhtYear, String email){
        this.family = family;
        this.name = name;
        this.secondName = secondName;
        this.birhtYear = birhtYear;
        this.email = email;
    }

    public int getBirhtYear() {
        return birhtYear;
    }

    public void getInfo(){
        System.out.println("ФИО: "+this.family + " " + this.name + " " + this.secondName+" ");
        System.out.println("Год  рождения: "+this.birhtYear+" год рождения"+" ");
        System.out.println("email: "+this.email+'\n');
    }
}
