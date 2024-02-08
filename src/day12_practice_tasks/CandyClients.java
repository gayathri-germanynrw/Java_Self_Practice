package day12_practice_tasks;

public class CandyClients {
    public static void main(String[] args) {
        Candy obj1=new Candy();
        obj1.setBrand("NumberOne");
        obj1.setQuantity(5);
        obj1.setPrice(0);
        obj1.setHasPeanuts(true);
        System.out.println("obj1 = " + obj1);

        Candy obj2=new Candy();
        obj2.setBrand("NumberTwo");
        obj2.setQuantity(4);
        obj2.setPrice(100);
        obj2.setHasPeanuts(true);
        System.out.println("obj2 = " + obj2);
  }
}
