package day16_practice_tasks;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        System.out.println(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));
        System.out.println(list2);

        list1.addAll(list2);
       // System.out.println(list1);

        // TreeSet gives natural order and avoid Duplicates
       Set<Integer> set = new TreeSet<>(list1);
        System.out.println(set);
    }
}
