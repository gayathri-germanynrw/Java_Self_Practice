package day13_practice_tasks.student_task;

public class UndergraduateStudent extends Sub_Student{

    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }
    @Override
    public void study() {
        System.out.println( "Student Name and School "+ super.getName() +"\t"+ getSchoolName());
    }
}
