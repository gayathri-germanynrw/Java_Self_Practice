package day10_practice_tasks;
import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {
        ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> duplicateList = new ArrayList<>(originalList);
        duplicateList.addAll(originalList);
        System.out.println("duplicateList = " + duplicateList);

    }
}
