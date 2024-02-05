package day07_practice_scanner_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter your Score :");
        int mark_Student=userInput.nextInt();
        String ter_Mark= ((mark_Student<0)||(mark_Student>100))?"Invalid Score .":(mark_Student>85)?"Your grade is B":
                "";
        userInput.close();
        System.out.println(ter_Mark);
    }
}
