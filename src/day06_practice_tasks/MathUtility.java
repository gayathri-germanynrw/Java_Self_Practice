package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {
        int result_integerValue = calculate(1, '+', 6);
        double result_doubleValue = calculate(7.0, '%', 6.0);
        int result_square = square(5);
        double result_doubleSquare = square(6.6);
        int result_cubeIntegerVal = cube(5);
        double result_CubeDoubleVal = cube(2.5);
        System.out.println("result from Integers = " + result_integerValue);
        System.out.println("result from Double  = " + result_doubleValue);
        System.out.println("Square from integer  = " + result_square);
        System.out.println("Square from Double  = " + result_doubleSquare);
        System.out.println("Cube from integer  = " + result_cubeIntegerVal);
        System.out.println("Cube from Double  = " + result_CubeDoubleVal);
      }

    public static int calculate(int num1, char operator, int num2) {
        int result;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> result = 0;
        }
        return result;
    }

    public static double calculate(double num1, char operator, double num2) {
        double result_doubleValue;
        switch (operator) {
            case '+' -> result_doubleValue = num1 + num2;
            case '-' -> result_doubleValue = num1 - num2;
            case '*' -> result_doubleValue = num1 * num2;
            case '/' -> result_doubleValue = num1 / num2;
            default -> result_doubleValue = 0.0;
        }
        return result_doubleValue;
    }


    public static int square(int num) {
        return num * num;
      }

    public static double square(double num) {
        return num * num;
      }
    public static int cube(int num) {
        return num * num * num;
     }
    public static double cube(double num) {
        return num * num * num;

    }
}
