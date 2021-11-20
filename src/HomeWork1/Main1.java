package HomeWork1;

public class Main1 {
    public static void main(String[] args){

        Team[] tM = {new Team("SouthPark","Kyle",1.2,900),
                new Team("SouthPark","Butters",1.1,1000),
                new Team("SouthPark","Stan",1.4,1200),
                new Team("SouthPark","CartMan",0.5,400),
                new Team("SouthPark","Kenny",2.1,2000)};
        System.out.println("В забеге учавствуют " + tM[0].nameTeamMate + " " + tM[1].nameTeamMate + " " + tM[2].nameTeamMate + " " + tM[3].nameTeamMate+ " " + tM[4].nameTeamMate);

        tM[0].race();tM[1].race();tM[2].race();tM[3].race();tM[4].killKenny();
    }
}