package day06_practice_tasks;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        maxBetweenTwoInteger(5, 10);
        maxBetweenTwoDouble(105.0, 50.0);
        minBetweenTwoInteger(501, 10);
        minBetweenTwoDouble(10.0, 500.0);
  }
   public static void maxBetweenTwoInteger(int num1, int num2) {
        if (num1 > num2) System.out.println("\nnum1 \"Integer\" is max than num2\t  " + num1);

    }
    public static void maxBetweenTwoDouble(double num1, double num2) {
        if (num1 > num2) System.out.println("num1 \"Integer\" is max than num2\t  " + num1);

    }
   public static void minBetweenTwoInteger(int num1, int num2) {
        if (num1 < num2) System.out.println("num1 \"double\"is minimum than num2\t  " + num1);

    }
   public static void minBetweenTwoDouble(double num1, double num2) {
        if (num1 < num2) System.out.println("num1 \"double\" is minimum than num2\t  " + num1);

    }
}
