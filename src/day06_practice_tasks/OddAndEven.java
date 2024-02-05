package day06_practice_tasks;

public class OddAndEven {
    public static void main(String[] args) {
        boolean result = isOdd(99);
        if (result == true) {
            System.out.println("the value is Odd\t " + result);
        } else {
            System.out.println("the value is Even\t " + result);
        }

    }

    public static boolean isOdd(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
