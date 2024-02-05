package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveTheZeros {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        moveZerosToLast(list);
    }
    public static void moveZerosToLast(ArrayList<Integer> list){
        ArrayList<Integer> zeroList=new ArrayList<>();
        ArrayList<Integer> NonzeroList=new ArrayList<>();
       for(int i=0;i<list.size();i++){
           if(!(list.get(i)==0)){
               NonzeroList.add(list.get(i));
           }
           else{
               zeroList.add(list.get(i));
          }
       }
        NonzeroList.addAll(zeroList);
        System.out.println("Moved Zeros to last index\t " + NonzeroList);

    }
}
