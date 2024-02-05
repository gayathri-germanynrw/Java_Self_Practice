package day04_practice_tasks;

public class OxygenTank {
    public static void main(String[] args) {
        int oxygenLevel=55;
        String message=(oxygenLevel>90)?" Your tank is full":(oxygenLevel>80)?
                "Still okay":(oxygenLevel>70)? "Don't go too far":
                (oxygenLevel>60)?"Start to head back":
                        "Be careful, you're at 50%";
        System.out.println( "Oxygen Level message---"+message);
       }
}
