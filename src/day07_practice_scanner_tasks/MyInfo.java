package day07_practice_scanner_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner myInfo = new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = myInfo.nextInt();

        System.out.println("Enter your gender ");
        String gender = myInfo.next();

        myInfo.nextLine();
        System.out.println("Enter your full name ");
        String fullName = myInfo.next();

        myInfo.nextLine();
        System.out.println("Enter your phone number");
        long phoneNumber = myInfo.nextLong();

        myInfo.nextLine();
        System.out.println("Enter your zip code ");
        int zipCode = myInfo.nextInt();


        System.out.println("Enter your School Name ");
        String schoolName = myInfo.nextLine();

        myInfo.nextLine();
        System.out.println("Enter your City Name ");
        String cityName = myInfo.nextLine();

        System.out.println("Enter your State Name ");
        String stateName = myInfo.next();

        myInfo.nextLine();
        System.out.println("Enter your Building Number ");
        int buildingNum = myInfo.nextInt();

        System.out.println("Enter your Street Name ");
        String streetName = myInfo.next();
        myInfo.close();
        System.out.println(fullName + "\n" +
                age + "\n" + schoolName + "\n" +
                gender + "\n" +
                "Address :\n" +
                "\t" + buildingNum +
                "\t" + streetName + "\n" + "\t" + cityName + "\n" +
                "\t" + stateName + "\n" +
                "\t" + zipCode
        );

    }
}
