package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>
                (Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        ArrayList<Integer> temp=new ArrayList<>(list);
        System.out.println("temp = " + temp);
        int n=3;

        // First 4 max number will be removed from this for loop
        for (int i = 1; i <n; i++) {
            temp.removeIf(p->p==Collections.max(temp));
            temp.removeIf(p->p==Collections.min(temp));
        }
        // Result will return the 5 the maximum number

        int result=Collections.max(temp);
        int result2=Collections.min(temp);

        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);
    }
}
