package day08_practice_tasks;

import java.util.Scanner;

public class EmailTask1_noStringMethods {
    public static void main(String[] args) {
        Scanner input_email=new Scanner(System.in);
        System.out.println("enter your first name : ");
        String firstName=input_email.next();
        System.out.println("enter your last name : ");
        String lastName=input_email.next();
        String usr_email="@gmail.com";
        String res_email= swap(firstName,lastName,usr_email);
        System.out.println("res_email = " + res_email);
      }
      public static String swap(String fName,String lName,String usr_email) {
          String emailAddress = fName + "_" + lName + usr_email;
          if (emailAddress.contains("_")) {
              return lName + "_" + fName + usr_email;
          } else {
              return emailAddress;
          }

      }

    //int underScore_k=email_address.indexOf('@',5);
//        System.out.println("underScore_k = " + underScore_k);
//       int str_at= email_address.lastIndexOf('@');
//        System.out.println("str_at = " + str_at);
//
//        int str_s= email_address.indexOf('s',0);
//        System.out.println("str_s = " + str_s);
//
//        int yes= email_address.lastIndexOf("world",0);
//        System.out.println("yes = " + yes);
//
}
