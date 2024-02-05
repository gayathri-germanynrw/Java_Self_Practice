package day07_practice_scanner_tasks;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the miles :");
        double mile_val=userInput.nextDouble();
        double km_val=mile_val*1.609;
        userInput.close();
        System.out.println(mile_val + "\tmiles is equal to  " + km_val +"\tkilometers");
    }
}
