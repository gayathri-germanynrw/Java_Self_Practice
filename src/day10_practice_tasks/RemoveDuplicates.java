package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;


public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        ArrayList<Integer> NonDuplicateList=new ArrayList<>(); // to store duplicates

        for(int i=0;i<list.size();i++){
           if(!NonDuplicateList.contains(list.get(i))){
               NonDuplicateList.add(list.get(i));
           }

        }
        System.out.println("NonDuplicateList = " + NonDuplicateList);
    }
}
