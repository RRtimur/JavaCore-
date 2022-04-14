package Lesson2;

import java.util.Random;

public class Main {
    //Какая боль.....а не джава


    public static void main(String[] args) {


        try{
            Array.makeArray(4,4);



        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }
    }



}