package Lesson1;

public class Course {
    private int benchPress = 230;
    private int highJump = 180;
    private int speedForRunDistance= 14;
    static int count1 = 0;
    int count2 = 0;

    int[] course = new int[3];

    public void startCourse(Team team){
        team.teamResults(this);
    }

    public void makeCourse(){
        course[0] =  benchPress;
        course[1] = highJump;
        course[2] =speedForRunDistance;
        System.out.println("Полоса препятсвий создана!");

    }


    public void result(Team team1, Team team2){
        count1 = team1.getCount();
        count2 = team2.getCount();
        System.out.println(count1 + " очков у команды "+ team1.getTeamName());
        System.out.println(count2 + " очков у команды "+ team2.getTeamName());
        if (count1>count2){ System.out.println(team1.getTeamName()+ " победила");
        }else if (count1<count2){
            System.out.println(team2.getTeamName()+ " победила");
        }else{
            System.out.println(team1.getTeamName()+ " Сыграла в Ничью с "+team2.getTeamName());
        }

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
