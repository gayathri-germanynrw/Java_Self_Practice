package day11_practice_tasks;

public class CydeoStudent {
    public String name;
    public int age;
    public int id;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static final String schoolName = "Cydeo Schools";
    public static final String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public String study(String name) {
        return name + "\tis studying ";
    }

    public String attendClass(String name) {
        return name + "\tis attending the live class.";
    }

    public String printSchoolName() {
        return CydeoStudent.schoolName;
    }

    public String printProgLanguage() {
        return CydeoStudent.programmingLanguage;
    }

    public String toString() {
        return "CydeoStudent {" +
                study(name) +
                "\t" + printSchoolName() +
                "\t" +"Programming Language is  " + printProgLanguage() +
                "," + attendClass(name) +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
