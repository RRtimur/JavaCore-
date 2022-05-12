package Lesson4;

import Lesson2.Array;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("Серый");
        colors.add("Голубой");
        colors.add("Красный");
        colors.add("Синий");
        colors.add("Желтый");
        colors.add("Серый");
        colors.add("Черный");
        colors.add("Оранжевый");
        colors.add("Зеленый");
        colors.add("Желтый");
        colors.add("Серый");

        Map<String, Integer> mapColors = new HashMap<>();
        mapColors.put(colors.get(0),1);
        mapColors.put(colors.get(1),1);
        mapColors.put(colors.get(2),1);
        mapColors.put(colors.get(3),1);
        mapColors.put(colors.get(4),1);
        mapColors.put(colors.get(5),2);
        mapColors.put(colors.get(6),1);
        mapColors.put(colors.get(7),1);
        mapColors.put(colors.get(8),1);
        mapColors.put(colors.get(9),2);
        mapColors.put(colors.get(10),3);

        for (Map.Entry<String, Integer> entry : mapColors.entrySet()) {

                System.out.println( "цвет - "  + entry.getKey() +", кол-во повторений - " + entry.getValue()  );

            }


        System.out.println(colors);
        System.out.println(mapColors);


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.makePhoneBook();

        phoneBook.add("+76543654353","Попов");

        phoneBook.getNumber("Иванов");





    }




}
