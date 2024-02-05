package day09_practice_tasks;

import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        int[] inputArr={10,0,5,0,1,0};
        moveTheZeros(inputArr);
    }
    public static void moveTheZeros(int[] inputArr){
        int[] resultArr=new int[inputArr.length];
        for(int i=0,j=0;i<inputArr.length;i++){
            if(inputArr[i]!=0){
                resultArr[j]=inputArr[i];
                j++;
            }
        }
      System.out.println("inputArr[j]  " + Arrays.toString(resultArr));
    }
}
