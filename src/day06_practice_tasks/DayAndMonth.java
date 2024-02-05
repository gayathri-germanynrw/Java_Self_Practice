package day06_practice_tasks;
public class DayAndMonth {
    public static void main(String[] args) {
        String dayFromNum = day(7);
        String MonthFromNum = monthName(6);
        String daysInMonth = daysInMonth(1);
        System.out.println("Day's name based on 6given  Number\t" + dayFromNum);
        System.out.println("Month's name based on given Number\t" + MonthFromNum);
        System.out.println("Number of days in the month based on given Number\t" + daysInMonth);
    } public static String day(int dayOfWeek) {
        String numDay;
        switch (dayOfWeek) {
            case 1 -> numDay = "Sunday";
            case 2 -> numDay = "Monday";
            case 3 -> numDay = "Tuesday";
            case 4 -> numDay = "Wednesday";
            case 5 -> numDay = "Thursday";
            case 6 -> numDay = "Friday";
            case 7 -> numDay = "Saturday";
            default -> numDay = "Invalid Number\n";
        }
        return numDay;}

 public static String monthName(int numFromMonth) {
        String monthNameFromNum;
        switch (numFromMonth) {
            case 1 -> monthNameFromNum = "January";
            case 2 -> monthNameFromNum = "Febraury";
            case 3 -> monthNameFromNum = "March";
            case 4 -> monthNameFromNum = "April";
            case 5 -> monthNameFromNum = "May";
            case 6 -> monthNameFromNum = "June";
            case 7 -> monthNameFromNum = "July";
            case 8 -> monthNameFromNum = "August";
            case 9 -> monthNameFromNum = "September";
            case 10 -> monthNameFromNum = "October";
            case 11 -> monthNameFromNum = "November";
            case 12 -> monthNameFromNum = "December";
            default -> monthNameFromNum = "Invalid Number .\t";
        }
        return monthNameFromNum;}
  public static String daysInMonth(int monthNum) {
        String daysInMonth;
        switch (monthNum) {
            case 1 -> daysInMonth = "January has 31days";
            case 2 -> daysInMonth = "Febraury has 28 days";
            case 3 -> daysInMonth = "March has 31 days";
            case 4 -> daysInMonth = "April has 30 days";
            case 5 -> daysInMonth = "May has 31 days";
            case 6 -> daysInMonth = "June has 30 days";
            case 7 -> daysInMonth = "July has 31 days";
            case 8 -> daysInMonth = "August has 31 days";
            case 9 -> daysInMonth = "September has 30 days";
            case 10 -> daysInMonth = "October has 31 days";
            case 11 -> daysInMonth = "November has 30 days";
            case 12 -> daysInMonth = "December has 31 days";
            default -> daysInMonth = "Invalid Number";

        }
        return daysInMonth;
    }}


