package day13_practice_tasks.student_task;

public class StudentClients {
    public static void main(String[] args) {
        UndergraduateStudent ugStudent=new UndergraduateStudent(
                "Anna", 20, "Female", "11", "IT", 'A', "Govt School");
        System.out.println("UndergraduateStudent ");
        System.out.println(ugStudent);
        ugStudent.study();
        System.out.println();

        GraduateStudent gStudent=new GraduateStudent(
                "Bavi", 20, "Female", "21", "IT", 'B', "Govt College");
        System.out.println("GraduateStudent ");
        System.out.println(gStudent);
        gStudent.study();
        System.out.println();

        CydeoStudent cydeoStudent=new CydeoStudent(
                "Reena", 30, "Female", "11", "IT", 'A', "Cydeo School",
        33,1,"Java SDET" );
        System.out.println("CydeoStudent ");
        System.out.println(cydeoStudent);
        cydeoStudent.study();
        System.out.println();

    }
}
