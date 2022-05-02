package Lesson3;

import Lesson1.People;
import Lesson2.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();


        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();


        Box<Apple> box1 = new Box<Apple>("Ящик с яблоками");
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);
        box1.addFruit(apple4);

        Box<Orange> box2 = new Box<>("Ящик с апельсинами");
        box2.addFruit(orange1);
        box2.addFruit(orange2);
        box2.addFruit(orange3);

        Box<Apple> box3 = new Box<Apple>("Еще один ящик с яблоками");

        box1.getWeightOfBox(apple1);
        box2.getWeightOfBox(orange1);

        box1.compare(box2);

        box1.throwFruit(box3);

        box3.checkSize();






    }

}
