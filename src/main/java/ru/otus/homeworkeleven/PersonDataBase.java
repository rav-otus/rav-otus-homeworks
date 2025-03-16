package ru.otus.homeworkeleven;
import java.util.*;

public class PersonDataBase {
    private Map<Long, Person> personList;
    public PersonDataBase (){
        personList = new HashMap<Long, Person>();
    }

    public void add(Person person) {
        personList.put(person.getId(), person);
    }

    public Person findById(Long id){
        Person person = personList.get(id);
        return person;
    }
    public boolean isManager(Person person){
        Position position = person.getPosition();
        if(position == Position.MANAGER || position == Position.DIRECTOR || position == Position.BRANCH_DIRECTOR || position == Position.SENIOR_MANAGER){
            return true;
        }
        return false;
    }
    public boolean isEmployee(Long id){
        Person person = personList.get(id);
        return !isManager(person);
    }

}
