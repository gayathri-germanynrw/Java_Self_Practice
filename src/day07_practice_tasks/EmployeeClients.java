package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Fiona";
        emp.age=30;
        emp.gender='F';
        emp.JobTitle="SDET QA";
        emp.salary=350_00;
        emp.work();
        System.out.println(emp);


    }
}
