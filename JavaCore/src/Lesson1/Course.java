package Lesson1;

public class Course {
    private int benchPress = 230;
    private int highJump = 180;
    private int speedForRunDistance= 14;


    int[] course = new int[3];


    public void makeCourse(){
        course[0] =  benchPress;
        course[1] = highJump;
        course[2] =speedForRunDistance;
        System.out.println("Полоса препятсвий создана!");
    }

    public void startCourse(Team team){

        System.out.println("Команда начала проходить полосу!");
        System.out.println();
        }



    public int getBenchPressCourse() {
        return benchPress;
    }

    public int getHighJumpCourse() {
        return highJump;
    }

    public int getSpeedForRunDistanceCourse() {
        return speedForRunDistance;
    }


}
