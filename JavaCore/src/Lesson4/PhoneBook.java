package Lesson4;

import java.util.*;

public class PhoneBook {
    private String secondName;
    private String phone;
    private Map<String, String> phoneBook = new HashMap<>();




    public void makePhoneBook() {
        phoneBook.put("+79643910872", "Иванов");
        phoneBook.put("+79643967901", "Иванов");
        phoneBook.put("+79990987634", "Семенов");
    }



    public void add(String phone, String secondName) {
        phoneBook.put(phone, secondName);
    }

    public void getNumber(String secondName) {


        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {

           if(secondName.equals(entry.getValue())){
               System.out.println( "Телефон - " + entry.getKey() +", Фамилия - " + entry.getValue()  );

           }
       }
    }


}