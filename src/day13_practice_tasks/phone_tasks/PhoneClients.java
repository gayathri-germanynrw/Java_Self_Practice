package day13_practice_tasks.phone_tasks;

public class PhoneClients {
    public static void main(String[] args) {
        IPhone iPhone=new IPhone("15","ProMax","Small",1500,"Black");
        System.out.println("IPhone :");
        System.out.println(iPhone);
        iPhone.call(122345);
        iPhone.text(122345);
        iPhone.faceTime(122345);
        System.out.println();

        Nokia nokia=new Nokia("17","Nokia1234","Big",5000,"Red");
        System.out.println("Nokia");
        System.out.println(nokia);
        nokia.call(122345);
        nokia.text(122345);
        System.out.println();


        Samsung samsung=new Samsung("19","SamsungModel","Medium",5000,"White");
        System.out.println("Samsung");
        System.out.println(samsung);
        samsung.call(122345);
        samsung.text(122345);
 }
}
