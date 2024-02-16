package day14_practice_tasks.car_task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("In Cydeo Car Auto Parking");
    }

    @Override
    public void selfDrive() {
        System.out.println("In Cydeo Car Self Driving");
    }

    @Override
    void start() {
        System.out.println("In Cydeo Car Starting");
    }

    @Override
    void drive() {
        System.out.println("In Cydeo Car driving");
    }

    @Override
    public void fly() {
        System.out.println("In Cydeo Car flying ");
    }
}
