package day11_practice_tasks;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
     }

    public Employee(String name, int age,char gender, String jobTitle, double salary) {
        this(name,age);
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String work(String name, String jobTitle) {
        return name + " is working as " + jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary + '\t' +
                ", "+work(name, jobTitle) +
                '}';
    }
}
