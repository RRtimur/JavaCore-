package Lesson1;

public class Main {
        public  static void main(String[] args){
        Course course = new Course();
        course.makeCourse();

        Team team1 = new Team("RedTeam");
        team1.makeTeam();
        team1.getTeamInfo();

        Team team2 = new Team("BlueTeam");
        team2.makeAnotherTeam();
        team2.getTeamInfo();

        course.startCourse(team1);
        team1.teamResults(course);

        course.startCourse(team2);
        team2.teamResults(course);

team1.theWinners();

        }

}
