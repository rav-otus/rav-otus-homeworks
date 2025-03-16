package ru.otus.homeworkten;

import java.util.*;

public class PhoneBook {
    private Map<String, HashSet<String>> fioPhones;

    public PhoneBook() {
        fioPhones = new HashMap<String, HashSet<String>>();
    }

    public void add(String fio, String phone) {
         if(fio==null || phone == null){
             throw new IllegalArgumentException("ФИО и телефон не могут быть null");
         }
        if (fioPhones.containsKey(fio)) {
            HashSet<String> phones = fioPhones.get(fio);
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
        } else {
            HashSet<String> phones = new HashSet<String>();
            phones.add(phone);
            fioPhones.put(fio, phones);
        }
    }

    public HashSet<String> find(String fio) {
        if (fioPhones.get(fio) == null) {
            System.out.println("Телефоны " + fio + " : отсутствуют");
            return null;
        }
        HashSet<String> phones = fioPhones.get(fio);
        System.out.println("Телефоны " + fio + " : " + phones);
        return phones;
    }

    public boolean containsPhoneNumber(String phone) {
        for (String fio : fioPhones.keySet()) {
            HashSet<String> phones = fioPhones.get(fio);
            if (phones.contains(phone)) {
                System.out.println("Телефон " + phone + " есть в справочнике. ФИО: " + fio);
                return true;
            }
        }
        System.out.println("Телефона " + phone + " в справочнике нет");
        return false;
    }
}
