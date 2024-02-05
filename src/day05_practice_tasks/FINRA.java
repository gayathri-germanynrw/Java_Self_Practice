package day05_practice_tasks;

public class FINRA {
    public static void main(String[] args) {
        for(int num=1;num<=100;num++){
            if((num%3==0)&&(num%5==0)){
                System.out.print("FINRA\t");
            }else if(num%3==0){
                System.out.print("FIN\t");
            }else if(num%5==0){
                System.out.print("RA\t");
            }else{
                System.out.print(num+"\t");
            }
            
        }

    }
}
