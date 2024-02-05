package day09_practice_tasks;

import java.util.Arrays;

public class StudentGrade {
    public static void main(String[] args) {
        String[] studentNames = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        gradeReport(studentNames, scores);

    }

    public static void gradeReport(String[] studentNames, int[] scores) {
        char[] gradeArray = new char[studentNames.length];
        for (int j = 0; j < studentNames.length; j++) {
            gradeArray[j] = scores[j] == 90 ? 'A' : scores[j] == 75 ? 'C' :
                        scores[j] == 80 ? 'B' : 'F';

        }
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]+ "\'s score is  " + scores[i]
                    + ", and Grade is  " + gradeArray[i]);
        }
    }
}
