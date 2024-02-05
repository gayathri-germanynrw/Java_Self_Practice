package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        String[] nameArr={"Anna Bauer", "Nancy Berger", "Sarah Stein","Priya Poormann", "Gayathri Kasi",
                "Devi Kandan","Kavi Deshingu","Malar Mala",
                 "Julie David", "Mia George"  };
        getInitialNames(nameArr);
     }

    public static void getInitialNames(String[] nameArr){
        String[] result=new String[nameArr.length];
        for(int i=0;i<nameArr.length;i++){
           // System.out.println(nameArr[i].charAt(0));
            //System.out.println(nameArr[i].indexOf(" ")+1); //indexOf returns index of first occurences the " " string.
           // System.out.println(nameArr[i].charAt(nameArr[i].indexOf(" ")+1));
            result[i]=nameArr[i].charAt(0)+""+nameArr[i].charAt(nameArr[i].indexOf(" ")+1);
            System.out.println(nameArr[i]+" \t having initials as\t" + result[i]);
        }

    }
}
