package day11_practice_tasks;

public class Chef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }
    public String makeOrder(String name){
        return name +" is making an order. ";
    }
    public String washDishes(String name){
        return name +" is washing the dishes.";
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
               "\t"+ makeOrder(name)+
                washDishes(name)+
                '}';
    }

    public static void main(String[] args) {
        Chef obj1=new Chef("DAMU",100,500.0,true);
        System.out.println("obj1 = " + obj1);
        Chef obj2=new Chef("OLIVIER",101,600.0,false);
        System.out.println("obj2 = " + obj2);
        Chef obj3=new Chef("TOM",102,700.0,true);
        System.out.println("obj3 = " + obj3);
        Chef obj4=new Chef("LEO",103,800.0,false);
        System.out.println("obj4 = " + obj4);
    }
}
