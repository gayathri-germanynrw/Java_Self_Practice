package day04_practice_switch_tasks;

public class NumberOfDays {
    public static void main(String[] args) {
        int month=2;
        switch(month){
            case 1,3,5,7,8,10,12:
                System.out.println("Months with 31 days \n");
                break;
            case 4,6,9,11:
                System.out.println("Months with 30 days \n");
                break;
            case 2:
                System.out.println("Month with 28 days \n");
                break;
            default:
                System.out.println("Invalid Month \n");
                break;
        }

    }
}
