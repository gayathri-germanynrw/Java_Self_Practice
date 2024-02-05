package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.binarySearch;

public class RemoveDuplicates_trial {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        int freq=0;
        ArrayList<Integer> NonDuplicateList=new ArrayList<>();
        Collections.sort(list);
        int result=0;
        for(int i=0;i<list.size();i++){
           freq= binarySearch(list,list.get(i));
            System.out.println("freq = " + freq);

        }
        System.out.println("NonDuplicateList = " + NonDuplicateList);
    }
}
