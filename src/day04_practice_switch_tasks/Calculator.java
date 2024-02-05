package day04_practice_switch_tasks;

public class Calculator {
    public static void main(String[] args) {
        double n1=50.8,n2=20.9,n3;
        char math_Operator='+';
        switch(math_Operator){
            case '+':
                n3=n1+n2;
                System.out.println("print the value of addition:\n"+n3);
                break;
            case '-':
                n3=n1-n2;
                System.out.println("print the value of subtraction:\n"+n3);
                break;
            case '*':
                n3=n1*n2;
                System.out.println("print the value of multiplication:\n"+n3);
                break;
            case '/':
                n3=n1/n2;
                System.out.println("print the value of division:\n"+n3);
                break;
            default:
                System.out.println("INVALID OPERATOR :\n");
            break;
        }
    }
}
