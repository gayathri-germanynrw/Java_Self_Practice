package day09_practice_tasks;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {
        int[] numbers=new int[100];

        // Assigning Values and print with "Tab space " separator to integer Array
         for(int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }
        //System.out.print(Arrays.toString(numbers)+"\t");
        System.out.println("----------------------");

        // Display the array in single line with tab space separator

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+"\t");
        }
        System.out.println("----------------------");

        // Reversing the Array
        for(int j=numbers.length-1;j>=0;j--){

            System.out.print(numbers[j]+"\t");
        }

        System.out.println("----------------------");

// Display the elements with evenly divisible by 5
        int[] divArr=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            if(i%5==0) {
               divArr[i]=i;
               System.out.print(divArr[i]+"\t");
            }
        }

        System.out.println("----------------------");
  }
}
