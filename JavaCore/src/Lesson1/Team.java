package Lesson1;

public class Team{
    private String teamName;


        public Team (String teamName){
        this.teamName = teamName;
    }

    People[] people = new People[4];
    public  void makeTeam() {

       people[0] = new People("Alexandr", 25, 184, 76, 14,230, 181);
       people[1] = new People("Sergei", 23, 174, 73, 15, 220, 171);
       people[2] = new People("Stepan", 26, 179, 75, 13, 235,175);
       people[3] = new People("Ahmed", 19, 189, 82, 14, 250, 183);

       System.out.println("Команда " + teamName + " создана!");
        System.out.println();
   }
    public void makeAnotherTeam() {

        people[0] = new People("Albert", 22, 182, 80, 13,230, 172);
        people[1] = new People("Sancho", 23, 178, 76, 15, 230, 185);
        people[2] = new People("Lapua", 29, 175, 70, 14, 245,180);
        people[3] = new People("Misha", 120, 186, 84, 14, 250, 183);

        System.out.println("Команда " + teamName + " создана!");
        System.out.println();
    }


   public void getTeamInfo(){

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getInfo());
        }
        System.out.println();
    }


    public void teamResults(Course course){

        for(int i = 0; i< people.length; i++){
            if(people[i].getBenchPress()>= course.getBenchPressCourse() &&
                    people[i].getHighJump()>= course.getHighJumpCourse() &&
                    people[i].getSpeed()>= course.getSpeedForRunDistanceCourse()){
                System.out.println(people[i].getInfo() + " прошел полосу препятсвий Успешно!");
            }else if(people[i].getBenchPress()< course.getBenchPressCourse()){
                System.out.println(people[i].getName() + " не смог пройти 'Жим лежа'");
            }else if(people[i].getSpeed()< course.getSpeedForRunDistanceCourse()){
                System.out.println(people[i].getName() + " не успел пробежать дистанцию");
            }else if(people[i].getHighJump()< course.getHighJumpCourse()){
                System.out.println(people[i].getName() + " не смог прыгнуть на необходимую высоту!");
            }
        }System.out.println();

    }
    public void theWinners(){

    }






}
