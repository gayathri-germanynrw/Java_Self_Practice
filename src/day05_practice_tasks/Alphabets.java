package day05_practice_tasks;

public class Alphabets {
   public static void main(String[] args) {
       for (char upperCaseAlphabets = 'A'; upperCaseAlphabets <= 'Z'; upperCaseAlphabets++) {
            for (char lowerCaseAlphabets = 'a'; lowerCaseAlphabets <= 'z'; lowerCaseAlphabets++) {
//                System.out.print(upperCaseAlphabets);
//                System.out.print(lowerCaseAlphabets + "\t");
                System.out.print(""+upperCaseAlphabets+lowerCaseAlphabets+"\t");

            }
            if (upperCaseAlphabets >= 'E') break;
            System.out.println();
        }
    }
}
