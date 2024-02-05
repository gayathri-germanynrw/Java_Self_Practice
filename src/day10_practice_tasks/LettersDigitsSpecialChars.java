package day10_practice_tasks;

import java.util.Arrays;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {
        String str = "Wooden Spoon123!";
        char[] strChar = str.toCharArray();
        String letter = "";
        int digits = 0;
        String specialChar = "";

        for (char eachChar : strChar) {

            if (Character.isLetter(eachChar)) {
                letter += eachChar;

            } else if (Character.isDigit(eachChar)) {
                digits += eachChar;

            } else if (!(Character.isLetterOrDigit(eachChar))) {
                specialChar += eachChar;

            } else {
                System.out.println("Invalid Input");
            }

        }
        System.out.println("Letters = \"" + letter + "\";\nDigits = \"" + digits + "\";" +
                "\nspecialChars = \"" + specialChar + "\";");
    }
}
