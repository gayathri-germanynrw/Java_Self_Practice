package day04_practice_tasks;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel=19;
        String message=(gradeLevel>=1 && gradeLevel<=5)?"Elementary shool":(gradeLevel>=6 && gradeLevel<=8)?"Middle School":(gradeLevel>=9 && gradeLevel<=12)?"High School":
                (gradeLevel>=13 && gradeLevel<=16)?"College":(gradeLevel>=17 && gradeLevel<=18)?"Grad School":"Invalid Grade Level";
        System.out.println("print the Meassage--->"+message);
    }
}
