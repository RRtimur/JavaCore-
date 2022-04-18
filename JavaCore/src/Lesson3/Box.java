package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {




    private int count= 0;
    private T obj;
    private List<T> box = new ArrayList<>();
    private String boxName;
    private int boxWeight;


    public Box(String boxName){
        System.out.println();
        this.boxName = boxName;
        System.out.println(boxName+" Создан!");

    }

    public Box(List<T> box){
        this.box = box;
    }


    public void addFruit(T fruit) {
        box.add(fruit);
        count++;
        System.out.println(boxName + " содержит: "+ count);
    }
    public void getWeightOfBox(T fruit){

        boxWeight=count * fruit.getWeight();
        System.out.println("Вес "+boxName+ " " + boxWeight);
    }
    public void compare(Box<? extends Fruit> anotherBox){
        if (this.boxWeight == anotherBox.boxWeight){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
    public void throwFruit(Box <T> anotherBox){
        anotherBox.box.addAll(this.box);
//        this.box.addAll(anotherBox.box);
        this.box.clear();

    }
    public int getCount() {
        return count;
    }
    public void checkSize(){
        System.out.println(box.size());
    }



}
