package day16_practice_tasks;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first String ");
        String str1 = scan.next();
        System.out.println("Enter your Second String ");
        String str2 = scan.next();
//        String str1="abcd";
//        String str2="ccddabaa";
//        str1 = "xyze"
//        str2 = "xyzd"

        Set<Character> set1 = new TreeSet<>();
        for (char eachSet1 : str1.toCharArray()) {
            set1.add(eachSet1);
        }

        Set<Character> set2 = new TreeSet<>();
        for (char eachSet2 : str2.toCharArray()) {
            set2.add(eachSet2);
        }
        boolean isFlag = false;
        if (set1.equals(set2)) {
            isFlag = true;
        }
        System.out.println("Anagram ---" + isFlag);
    }
}
