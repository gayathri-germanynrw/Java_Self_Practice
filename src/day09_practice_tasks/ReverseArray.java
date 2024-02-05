package day09_practice_tasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array=new int[20];
        int[] resultArr=getReverseArray(array);
        System.out.println("The Reverse Array is \t " + Arrays.toString(resultArr));
    }
    public static int[] getReverseArray(int[] array){
        // Assign values into Array
        int[] reverseArr=new int[array.length];
        for(int i=0;i<array.length;i++){
            array[i]=i+1;

        }
        System.out.println("The Array is \t"+Arrays.toString(array )+"\t");
        // Reverse an Array

        for(int i=array.length-1,j=0;i>=0;i--,j++){
            reverseArr[j]=array[i];
        }
        return reverseArr;
    }
}
