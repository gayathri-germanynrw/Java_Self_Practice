package day10_practice_tasks;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        int freq;
        ArrayList<Integer> UniqueList=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            freq=Collections.frequency(list,list.get(i));
            if(freq==1){
                UniqueList.add(list.get(i));
            }
        }
        System.out.println("UniqueList = " + UniqueList);
   }
}
