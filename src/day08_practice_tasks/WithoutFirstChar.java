package day08_practice_tasks;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {
        Scanner user_Words=new Scanner(System.in);
        System.out.println("Enter the first Word");
        String firstWord=user_Words.next();
        System.out.println("Enter the second Word");
        String secondWord=user_Words.next();
        user_Words.close();
        String result1=firstWord.substring(1,firstWord.length());
        String result2=secondWord.substring(1,secondWord.length());

       System.out.println(result1+result2);
    }
}
