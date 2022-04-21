package Lesson1;

public class People {


    private String name;
    private int age;
    private int height;



    private int weight;
    private int speed;
    private int benchPress;
    private int highJump;
    private int count = 0;



    public void setCount(int count){
        this.count = count;

    }



    private People[] peoples; public void makeTeam(People ... peoples){
        this.peoples = peoples;
    }



    public People(String name, int age, int height, int weight, int speed, int benchPress, int highJump){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.benchPress = benchPress;
        this.highJump = highJump;
    }

    public String getInfo(){
        return "Имя " + name + " Возраст " + age + " Рост " + height+ " Вес " + weight +" Скорость " + speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBenchPress() {
        return benchPress;
    }

    public int getHighJump() {
        return highJump;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
