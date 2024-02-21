package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindrome_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));
        System.out.println(list);   // Arrays.asList  allows null also.

        // Using Iterator  , (hasNext(), next(), remove methods )
        Iterator<String> itr = list.iterator(); // returns Iterator interface
        while (itr.hasNext()) {
            String str = itr.next();
            String str2 = new StringBuilder(str).reverse().toString();
            if (str.equalsIgnoreCase(str2)) {
                itr.remove();
            }
        }
        System.out.println(list);

    }
}
