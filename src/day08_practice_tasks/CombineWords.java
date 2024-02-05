package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {
        Scanner user_Words = new Scanner(System.in);
        System.out.println("Enter the first Word");
        String firstWord = user_Words.next();
        System.out.println("Enter the second Word");
        String secondWord = user_Words.next();
        user_Words.close();
        String com_word=combiWords(firstWord,secondWord);
        System.out.println("com_word = " + com_word);
    }
    public static String combiWords(String str1,String str2){
        String result="";
        if(str1.length()>0 && str2.length()>0){
            if(str1.charAt(str1.length()-1)==str2.charAt(0)){
                result=str1+str2.substring(0);
            }else{
                result="last letter of firstword and first letter of second word are not same";
            }
        }
         return result;
    }

}
