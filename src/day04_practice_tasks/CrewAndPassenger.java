package day04_practice_tasks;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int peopleOnShip=85;
        if(peopleOnShip==50){
            System.out.println("20 crew , 30 passenger:\n");
        }else if(peopleOnShip==75){
            System.out.println("25 crew , 50 passenger:\n");
        }else if(peopleOnShip==100){
            System.out.println("30 crew , 70 passenger:\n");
        }else{
            System.out.println("Not VALID\n");
        }

    }
}
