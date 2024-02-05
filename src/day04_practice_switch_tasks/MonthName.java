package day04_practice_switch_tasks;

public class MonthName {
    public static void main(String[] args) {
        int number_of_month=10;
        switch(number_of_month){
            case 1:
                System.out.println(" January \n");
                break;
            case 2:
                System.out.println(" febraury \n");
                break;
            case 3:
                System.out.println(" March \n");
                break;
            case 4:
                System.out.println(" April \n");
                break;
            case 5:
                System.out.println(" May \n");
                break;
            case 6:
                System.out.println(" June \n");
                break;
            case 7:
                System.out.println(" July \n");
                break;
            case 8:
                System.out.println(" August \n");
                break;
            case 9:
                System.out.println(" September \n");
                break;
            case 10:
                System.out.println(" October \n");
                break;
            case 11:
                System.out.println(" november \n");
                break;
            case 12:
                System.out.println(" December \n");
                break;
            default:
                System.out.println(" No such Month \n");
                break;
        }
    }
}
