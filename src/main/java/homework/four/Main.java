package homework.four;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        users[0] = new User("Иванов", "Иван", "Иванович", 1980, "ivan@mail.ru");
        users[1] = new User("Малкович", "Джон", "Смит", 1990, "john@inbox.ru");
        users[2] = new User("Алабаев", "Мурат", "Хасанович", 1978, "alabaev@mail.ru");
        users[3] = new User("Петров", "Петр", "Иванович", 1965, "petr@mail.ru");
        users[4] = new User("Иванов", "Сергей", "Иванович", 1982, "sergey@mail.ru");
        users[5] = new User("Дикаприо", "Леонид", "Петрович", 2000, "dikap@mail.ru");
        users[6] = new User("Леонтьев", "Валерий", "Геннадьевич", 2003, "leon@mail.ru");
        users[7] = new User("Зубов", "Михаил", "Сергеевич", 1949, "zubov@pochta.com");
        users[8] = new User("Антонов", "Юрий", "Михайлович", 1930, "antonov@google.com");
        users[9] = new User("Макеева", "Анастасия", "Олеговна", 1989, "makkeva@mail.ru");

        Date date = new Date();
        int year = date.getYear() + 1900;

        for (int i = 0; i < users.length; i++) {
            if (year - users[i].getBirhtYear() > 40) {
                users[i].getInfo();
            }
        }
    }
}