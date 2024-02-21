package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindrome_Removeif {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));
        System.out.println(list);   // Arrays.asList  allows null also.

        // Remove element which is palindrome ( P is an element of list)
        list.removeIf(p -> isPalindrome(p));
        System.out.println("List after removed palindrome from list");
        System.out.println(list);
    }

    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversedStr);
    }


}
