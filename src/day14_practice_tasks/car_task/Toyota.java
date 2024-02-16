package day14_practice_tasks.car_task;

import day14_practice_tasks.car_task.Car;

public class Toyota extends Car {
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    void start() {
        System.out.println(" In Toyota car Start ");
    }

    @Override
    void drive() {
        System.out.println(" In Toyota car Drive method");
    }
}
