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

        // Using Iterator
        List<String> list2 = new ArrayList<>();
        Iterator itr =list.iterator();
       while(itr.hasNext()){

           String str=itr.next().toString();
           if (str.equalsIgnoreCase(new StringBuilder(str).reverse().toString())) {
               continue;
           }
           list2.add(str);
        }
        System.out.println(list2);

    }
}
