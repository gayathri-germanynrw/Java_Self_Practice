package day04_practice_tasks;

public class AgeGroups {
    public static void main(String[] args) {
        int age=45;
        if(age>=0 && age<=20){
            System.out.println(" Teenager : age is "+age);
        }else if(age>=21 && age<=55){
            System.out.println(" Adult : age is "+age);
        }else if(age>=55 && age<=150){
            System.out.println(" Older : age is "+age);
        }else{
            System.out.println("Invalid");
        }

    }
}
