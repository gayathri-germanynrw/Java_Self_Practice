package day08_practice_tasks;

import java.util.Scanner;

public class RegularFormatNames {
    public static void main(String[] args) {
        Scanner usr_data = new Scanner(System.in);
        System.out.println("enter your first name : ");
        String firstName = usr_data.next();
        System.out.println("enter your last name : ");
        String lastName = usr_data.next();
        usr_data.close();
        regFormat(firstName,lastName);
     }
    public static void regFormat(String fName,String lName){
       fName=fName.substring(0,1).toUpperCase()
               +fName.substring(1,fName.length()).toLowerCase();
        lName=lName.substring(0,1).toUpperCase()
                +lName.substring(1,lName.length()).toLowerCase();

        System.out.println(fName +"\t"+lName);
    }

}
