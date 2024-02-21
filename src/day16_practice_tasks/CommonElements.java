package day16_practice_tasks;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class CommonElements {
    public static void main(String[] args) {
        Set<Integer> set1=new TreeSet<>();
        set1.addAll(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> set2=new TreeSet<>();
        set2.addAll(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> set3=new TreeSet<>();
        for(Integer eachFrmSet1: set1){
            for(Integer eachFrmSet2: set2){
                if(eachFrmSet1==eachFrmSet2){
                    set3.add(eachFrmSet1);
                }
            }
        }
        System.out.println(set3);


    }
}
