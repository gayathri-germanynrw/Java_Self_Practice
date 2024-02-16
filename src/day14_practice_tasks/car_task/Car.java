package day14_practice_tasks.car_task;

public abstract class Car {
    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        if (make == null || make.isBlank() || make.isEmpty()) {
            throw new RuntimeException(" make can not be empty or null or blank");
        }

        this.model = model;
        if (model == null || model.isBlank() || model.isEmpty()) {
            throw new RuntimeException(" model can not be empty or null or blank");
        }
        this.year = year;
        if (year < 1980) {
            throw new RuntimeException("Not a Valid Year ");
        }
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new RuntimeException("Price can not be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            throw new RuntimeException(" Color can not be empty or null or blank");
        }
        this.color = color;
    }

    abstract void start();

    abstract void drive();

    public void stop() {
        System.out.println(" Car is stopped ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
