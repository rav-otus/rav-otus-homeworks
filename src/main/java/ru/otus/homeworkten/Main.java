package ru.otus.homeworkten;


public class Main {
    public static void main(String[] args) {
        PhoneBook phonesBook = new PhoneBook();

        phonesBook.add("John", "89301234567");
        phonesBook.add("Jack", "89301230000");
        phonesBook.add("Jennifer", "82039876541");
        phonesBook.add("John", "893012345868");

        phonesBook.find("John");
        phonesBook.containsPhoneNumber("82039876541");
        phonesBook.find("Olga");
        phonesBook.containsPhoneNumber("82039876540");

    }
}
