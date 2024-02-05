package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        ArrayList<String> charArrListOne=new ArrayList<>(Arrays.asList("A","B","C"));
        ArrayList<String> charArrListTwo=new ArrayList<>(Arrays.asList("D","E","F","G"));
        charArrListOne.addAll(charArrListTwo);
        System.out.println("List ==> " +charArrListOne );

    }
}
