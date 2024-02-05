package day05_practice_tasks;

public class SumOfNumbers {
    public static void main(String[] args) {
        int number=100;
        int sum=0;
        for(int i=0;i<=number;i++){
            sum+=i;
        }
        System.out.println("sum = " + sum);
    }
}
