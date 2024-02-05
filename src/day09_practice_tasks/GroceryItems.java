package day09_practice_tasks;

import java.util.Arrays;

public class GroceryItems {
    public static void main(String[] args) {
        String[][] item2D = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (int i = 0; i < item2D.length; i++) {
            //System.out.println(Arrays.deepToString(item2D[i]).replaceAll(",", "\t"));
            for (int j = 0; j <item2D[i].length; j++) {
                System.out.print(item2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        for (int i = 0; i < item2D.length; i++) {
            //System.out.println( Arrays.deepToString(item2D[i]).replaceAll(",","\t"));
            for (int j = item2D[i].length - 1; j >= 0; j--) {
                System.out.print(item2D[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        for (int i = item2D.length - 1; i >= 0; i--) {
            //System.out.println(Arrays.deepToString(item2D[i]).replaceAll(",", "\t"));
            for (int j = 0; j <item2D[i].length; j++) {
                System.out.print(item2D[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
