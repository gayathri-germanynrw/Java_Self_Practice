package day09_practice_tasks;

import java.util.Arrays;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        getOddAndEvenNum(numbers);
    }

    public static void getOddAndEvenNum(int[] numbers) {
        //Assign values to array
        int freqEven = 0;
        int freqOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            if (numbers[i] % 2 == 0) {
                freqEven++;

            } else {
                freqOdd++;
            }
        }
        System.out.println(" The array has Even " + freqEven + "\tnumbers\t " +
                " \tThe array has Odd  " + freqOdd + "\tnumbers\t ");

    }
}
