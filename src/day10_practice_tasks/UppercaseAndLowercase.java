package day10_practice_tasks;

public class UppercaseAndLowercase {
    public static void main(String[] args) {
        String str = "JAVA java";
        int upperCase = 0;
        int lowercase = 0;
        for (char c : str.toCharArray()) {

            if (Character.isUpperCase(c)) {
                upperCase++;
            }
            if (Character.isLowerCase(c)) {
                lowercase++;
            }

        }
        System.out.println("lowercase = " + lowercase);
        System.out.println("upperCase = " + upperCase);
        Boolean output = upperCase == lowercase;
        System.out.println(output);
    }
}