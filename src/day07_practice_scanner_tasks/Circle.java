package day07_practice_scanner_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
        System.out.println("Enter the radius :");
        int radiusInput= (int) userInput.nextDouble();
        double areaOfCircle=3.14*radiusInput*radiusInput;
        double perimeterOfCircle=2*3.14*radiusInput;
        userInput.close();
        System.out.println("The area Of the Circle is  " + areaOfCircle);
        System.out.println("The perimeter Of Circle is  " + perimeterOfCircle);
   }
}
