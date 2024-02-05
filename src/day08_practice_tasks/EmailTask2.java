package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner input_email = new Scanner(System.in);
        System.out.println("enter your email : ");
        String email_address = input_email.next();
        input_email.close();
        splitTheName(email_address);
    }

    public static void splitTheName(String email_address) {
        int underscore = email_address.indexOf('_');
        int atSymbol = email_address.indexOf('@');
        if (underscore != 0) {
            String firstName = email_address.substring(0, underscore);
            String lastName = email_address.substring(underscore + 1, atSymbol);
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length());
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length());
            int dot_val = email_address.indexOf('.');
            String res_domain = email_address.substring(atSymbol + 1, dot_val);
            System.out.println("First Name : " + firstName);
            System.out.println("Last Name : " + lastName);
            System.out.println("Domain : " + res_domain);
        }
    }
}
