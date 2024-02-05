package day08_practice_tasks;


import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input_email = new Scanner(System.in);
        System.out.println("enter your email : ");
        String email_address = input_email.next();
        input_email.close();
        System.out.println(email_address);
        String res_email = swapName(email_address);
        System.out.println("res_email = " + res_email);

    }

    public static String swapName(String email_address) {
        int underScore = email_address.indexOf('_');
        int atSymbol = email_address.indexOf('@');
        System.out.println("underScore = " + underScore);
        if (underScore != 0) {
            String firstName = email_address.substring(0, underScore);
            System.out.println("firstName = " + firstName);
            String lastName = email_address.substring(underScore + 1, atSymbol);
            String domainName = email_address.substring(atSymbol);
            System.out.println("lastName = " + lastName);
            String swappedNameEmail = firstName.replace(firstName, lastName) + "_" + firstName
                    + domainName;
            return swappedNameEmail;
        } else {
            return email_address;
        }
    }
}
