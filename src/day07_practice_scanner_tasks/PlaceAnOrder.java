package day07_practice_scanner_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner placeOrder=new Scanner(System.in);

        System.out.println("Enter your Product Name ");
        String productName=placeOrder.next();

        System.out.println("Enter your Price ");
        double price=placeOrder.nextDouble();

        System.out.println("Enter your Quantity ");
        int quantity=placeOrder.nextInt();

        System.out.println("Enter your First Name ");
        String firstName=placeOrder.next();

        placeOrder.close();
        System.out.println(firstName+",your order for \t"+quantity +"\t"+ productName+" Apples has been placed. Your total is "+(quantity*price));
   }
}
