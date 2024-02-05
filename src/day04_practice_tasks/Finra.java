package day04_practice_tasks;

public class Finra {
    public static void main(String[] args) {
        int number=-6;
        boolean valid=(number<=0);
        if(valid){
            System.err.println("Please enter positive number ");
            System.exit(1);
        }
        String message=(number%3==0 && number%5==0)?"FINRA":(number%5==0)?"RA":
                (number%3==0 )?"FIN":"Number is not multiple of 3 or 5 ";


        System.out.println("print the message --->"+message);
    }
}
