package Lesson1;

import java.util.DoubleSummaryStatistics;

public class Team{



    private int count = 0;

    public String getTeamName() {
        return teamName;
    }

    private String teamName;


        public Team (String teamName){
        this.teamName = teamName;
        System.out.println(teamName + " Команда создана!");
    }

    People[] people = new People[4];

    public void makeTeam(People ... people){
        this.people = people;
    }





   public void getTeamInfo(){

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getInfo());
        }
        System.out.println();
    }


    public void teamResults(Course course){

        for(int i = 0; i< people.length; i++){

            if(people[i].getBenchPress()>= course.getBenchPressCourse()){
                count++;
                System.out.println(people[i].getName()+ " из команды "+ teamName+ " Приносит очко команде по Жиму лежа!");
            } if (people[i].getHighJump()>= course.getHighJumpCourse()){
                count++;
                System.out.println(people[i].getName()+ " из команды "+ teamName + " Приносит очко команде по Прыжкам в высоту!");
            } if(people[i].getSpeed()>= course.getSpeedForRunDistanceCourse()){
                count++;
                System.out.println(people[i].getName()+ " из команды "+ teamName+ " Приносит очко команде по Бегу на дистанцию!");
            }

        }
        System.out.println(count + " Очков у команды "+ teamName);
        System.out.println();

    }
    public int getCount() {
        return count;
    }
}
