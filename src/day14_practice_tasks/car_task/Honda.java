package day14_practice_tasks.car_task;

import day14_practice_tasks.car_task.Car;

public class Honda extends Car {

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    void start() {
        System.out.println("In Honda Car Start Method");
    }

    @Override
    void drive() {
        System.out.println("In Honda CAr drive Method ");

    }
}
