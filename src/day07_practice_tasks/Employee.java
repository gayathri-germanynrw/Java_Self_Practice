package day07_practice_tasks;

public class Employee {

    public String name, JobTitle;
    public int age;
    public char gender;
    public double salary;

    public void work() {
        System.out.println("plays the " + JobTitle + " and  " + name + " is working .");

    }

    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", JobTitle='" + JobTitle + '\'' + ", age='" + age + '\'' + ", gender=" + gender + ", salary=" + salary + '}';
    }
}
