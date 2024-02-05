package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SameFirstAndLast {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>
                (Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        list.removeIf(p->p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
        System.out.println("list = " + list);
        /*
        int strLen=0;
        String str1="",str2="";
        ArrayList<String> FinalList=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            strLen=list.get(i).length();
            str1= String.valueOf(list.get(i).charAt(0));
            str2= String.valueOf(list.get(i).charAt(strLen-1));
            if(!(str1.equalsIgnoreCase(str2))){
                 FinalList.add(list.get(i));
            }

        }
        System.out.println(FinalList);
         */
   }
}
