package day14_practice_tasks.car_task;

import day14_practice_tasks.car_task.AutoPark;
import day14_practice_tasks.car_task.Car;

public class Mercedes extends Car implements AutoPark {

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("In Mercedes car Auto Parking ");
    }

    @Override
    void start() {
        System.out.println("In Mercedes car Starting ");
    }

    @Override
    void drive() {
        System.out.println("In Mercedes car Driving ");
    }
}
