package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        multiplyOddNum(list);
    }
    public static void multiplyOddNum(ArrayList<Integer> list){
        ArrayList<Integer> finalList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2!=0){
                finalList.add(list.get(i) * 2);
            }else{
                finalList.add(list.get(i));
            }
          }
        System.out.println("odd Num mul by 2 ----\t " + finalList);

    }
}
