package Lesson1;

public class Main {
        public  static void main(String[] args){
        Course course = new Course();
        course.makeCourse();

        Team team1 = new Team("RedTeam");
        team1.makeTeam(new People("Sania",20,182,82,14,220, 171),
                new People("Sergei",23, 174, 73, 15, 220, 180),
                new People("Valera",25, 180, 78, 13, 240, 179),
                new People("Nikita",20, 177, 82, 14, 250, 172));
        Team team2 = new Team("BlueTeam");
        team2.makeTeam(new People("Andrei",27, 184, 83, 13, 245, 182),
                new People("Jenia",24, 182, 76, 15, 241, 179),
                new People("Gena", 21, 178, 74, 13, 235, 176),
                new People("Misha",19, 184, 74, 15, 250, 185)); //Миша машина!
                course.startCourse(team1);
                course.startCourse(team2);
                course.result(team1,team2);



        }

}
