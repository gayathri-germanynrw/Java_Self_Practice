package day02_practice_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";
        System.out.println("Employee name: " + employeeName +
                "\nGender: " + gender + "\nAge: " + age
                + "\nEmployee ID: " + employeeId
                + "\nJob title: " + jobTitle
                + "\nCompany name: " + companyName
                + "\nFull time: " + isFullTime
                + "\nYears of work experience: " + yearsOfExperience
                + "\nSalary: $" + salary + "\nMarried: " + isMarried);
    }
}
