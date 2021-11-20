package HomeWork1;

import java.util.Objects;

public class Team {
    protected String nameTeam;
    protected String nameTeamMate;
    protected double jumpHeight;
    protected int runDistance;

    Team(String nameTeam,String nameTeamMate, double jumpHeight, int runDistance){

        this.nameTeam = nameTeam;
        this.nameTeamMate = nameTeamMate;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }
    Course newCourse = new Course(1,500);
    public void race(){
        if(newCourse.Distance <= runDistance && newCourse.barrierHeight <= jumpHeight)
            System.out.println(nameTeamMate + " " + "из команды " + nameTeam + " преодолел дистанцию, прыгнув на " + jumpHeight + " м и пробежав " + runDistance + " м");
        else System.out.println("Жиртрест " + nameTeamMate + " " + " из команды " + nameTeam + " не смог преодолеть дистанцию " + "прыгнув " + jumpHeight + " м и пробежав " + runDistance + " м");
    }
    public void killKenny(){
        if(Objects.equals(nameTeamMate, "Kenny")) System.out.println("Кенни не смог преодолеть дистанцию. Сволочи! Они убили Кенни!");
    }

}
