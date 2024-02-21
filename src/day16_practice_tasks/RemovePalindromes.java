package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));
        System.out.println(list);   // Arrays.asList  allows null also.
        StringBuilder str1;
        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            str1 = new StringBuilder(list.get(i));
            if (!(list.get(i).equalsIgnoreCase(str1.reverse().toString()))) {
                list2.add(list.get(i));
            }
        }
        System.out.println(list2);

    }
}
