package ru.otus.homeworkeleven;

public class Person {
    String name;
    Position position;
    Long id;

    public Person(String name, Position position, Long id){
        this.name = name;
        this.position = position;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
