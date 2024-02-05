package day08_practice_tasks;

public class fibo {
    public static void main(String[] args) {
        int a=0,
                b=1,n=5,c=0;

        for(int i=0;i<=10;i++){
            System.out.print(" " + a);
            c=a+b;
            a=b;
            b=c;

        }

    }
}
