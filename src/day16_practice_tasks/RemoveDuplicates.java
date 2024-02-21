package day16_practice_tasks;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        System.out.println(list);
        // Using Treeset avoid duplicates
        Set<Integer> set = new TreeSet<>(list); // passing list to Constructor of Tree Set
        System.out.println(set);

//        List<Integer> uniqueList=new ArrayList<>();
//            for (Integer each : list) {
//                if(uniqueList.contains(each)){
//                    continue;
//                }
//                uniqueList.add(each);
//          }
//        System.out.println("uniqueList---"+uniqueList);

    }
}
