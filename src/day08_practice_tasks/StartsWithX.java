package day08_practice_tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner user_input=new Scanner(System.in);
        System.out.println("Enter your input String :");
        String user_String=user_input.next();
        if(user_String.startsWith("x"))
            user_String=user_String.replaceFirst("x", "a");
        System.out.println(user_String);

    }
}
