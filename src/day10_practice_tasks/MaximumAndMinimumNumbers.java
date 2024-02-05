package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
       int maxNum= Collections.max(list);
       int minNum=Collections.min(list);
        System.out.println("Maximum number is\t " + maxNum);
        System.out.println("Minimum number is\t" + minNum);

    }
  }
