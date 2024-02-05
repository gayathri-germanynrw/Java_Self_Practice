package day07_practice_scanner_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter your cents :");
        int cent_val=userInput.nextInt();
        int dollar=cent_val/100;
        int cent=cent_val%100;
        userInput.close();
        System.out.println(cent_val +"\tcents is equal to "+dollar+"\tdollars and "+
                cent +"\tcents " );
       
    }
}
