package day10_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {
        ArrayList<Character> list=new ArrayList<>
                (Arrays.asList('$','A','B','1','2','c','d','@','!','3','4'));

        ArrayList<Character> RemovedLettList=new ArrayList<>();
        for(Character each:list){
            if(!(Character.isLetter(each))){
                RemovedLettList.add(each);
            }
        }
        System.out.println("Removed Letter List = " + RemovedLettList);

    }
}
