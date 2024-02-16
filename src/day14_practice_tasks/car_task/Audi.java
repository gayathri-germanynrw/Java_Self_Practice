package day14_practice_tasks.car_task;

public class Audi extends Car implements AutoPark {

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    void start() {
        System.out.println("In Audi Car Starting");
    }

    @Override
    void drive() {
        System.out.println("In Audi Car driving");
    }

    @Override
    public void autoPark() {
        System.out.println("In Audi Car AutoParking...");
    }
}
