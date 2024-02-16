package day14_practice_tasks.car_task;

public class BMW extends Car {

    public BMW(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    void start() {
        System.out.println("In BMW Car Start Method");
    }

    @Override
    void drive() {
        System.out.println("In BMW Car drive Method");
    }
}
