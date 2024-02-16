package day14_practice_tasks.car_task;

public class CarClients {
    public static void main(String[] args) {
        //make, model, year, price, color
        Toyota toyota=new Toyota("Toyota","Model_Toyota",1999,10_0000,"White");
        System.out.println("Toyota");
        toyota.start();
        toyota.drive();
        toyota.stop();
        System.out.println(toyota);
        System.out.println();

        Honda honda=new Honda("Honda","Model_Honda",2012,10_0000,"Black");
        System.out.println("Honda");
        honda.start();
        honda.drive();
        honda.stop();
        System.out.println(honda);
        System.out.println();


        BMW bmw=new BMW("BMW","Model_Bmw",2020,20_0000,"Brown");
        System.out.println("BMW");
        bmw.start();
        bmw.drive();
        bmw.stop();
        System.out.println(bmw);
        System.out.println();

        Audi audi=new Audi("Audi","Model_Audi",2020,50_0000,"Red");
        System.out.println("AUDI");
        audi.start();
        audi.drive();
        if (audi instanceof AutoPark) {
            AutoPark autoParkCar =audi;
            System.out.println("Audi has Auto park " + autoParkCar.hasAutoPark);
            autoParkCar.autoPark();
        }
        audi.stop();
        System.out.println(audi);
        System.out.println();

        Mercedes mercedes=new Mercedes("mercedes","Model_Mercedes",2022,50_0000,"Yellow");
        System.out.println("MERCEDES");
        mercedes.start();
        mercedes.drive();
        if(mercedes instanceof AutoPark) {
            AutoPark autoPark=mercedes;
            System.out.println("Mercedes has Auto Park "+ autoPark.hasAutoPark);
            autoPark.autoPark();
        }
        mercedes.stop();
        System.out.println(mercedes);
        System.out.println();

        Tesla tesla=new Tesla("Tesla","Model_Tesla",2022,50_0000,"Yellow");
        System.out.println("TESLA");
        tesla.start();
        tesla.drive();
        if(tesla instanceof AutoPark){
            AutoPark I_autoPark=(AutoPark) tesla;
            System.out.println("Tesla has auto parking "+I_autoPark.hasAutoPark);
            I_autoPark.autoPark();
        }

        if(tesla instanceof AutoPilot){
            AutoPilot I_autoPilot=(AutoPilot) tesla;
            System.out.println("Tesla has auto driving "+I_autoPilot.hasAutoPilot);
            I_autoPilot.selfDrive();
        }

        tesla.stop();
        System.out.println(tesla);
        System.out.println();

        Nio nio=new Nio("Nio","Model_Nio",2022,50_0000,"Blue");
        System.out.println("NIO");
        nio.start();
        nio.drive();
        if(nio instanceof AutoPark){
            AutoPark I_autoPark=(AutoPark) nio;
            System.out.println("NIO car has auto parking "+I_autoPark.hasAutoPark);
            I_autoPark.autoPark();
        }

        if(nio instanceof AutoPilot){
            AutoPilot I_autoPilot=(AutoPilot) nio;
            System.out.println("NIO car has auto driving "+I_autoPilot.hasAutoPilot);
            I_autoPilot.selfDrive();
        }
        nio.stop();
        System.out.println(nio);
        System.out.println();

        CydeoCar cydeoCar=new CydeoCar("CydeoCar","Model_CydeoCar",2022,50_0000,"Blue");
        System.out.println("CYDEO CAR");
        cydeoCar.start();
        cydeoCar.drive();
        if(cydeoCar instanceof AutoPark){
            AutoPark I_autoPark=(AutoPark) cydeoCar;
            System.out.println("CYDEO CAR  has auto parking "+I_autoPark.hasAutoPark);
            I_autoPark.autoPark();
        }

        if(cydeoCar instanceof AutoPilot){
            AutoPilot I_autoPilot=(AutoPilot) cydeoCar;
            System.out.println("Cydeo car has auto driving "+I_autoPilot.hasAutoPilot);
            I_autoPilot.selfDrive();
        }
        if(cydeoCar instanceof Flyable){
            Flyable I_flyable=cydeoCar;
            System.out.println("Cydeo car has flying option "+I_flyable.canFly);
            I_flyable.fly();
        }
        cydeoCar.stop();
        System.out.println(cydeoCar);
        System.out.println();




    }
}
