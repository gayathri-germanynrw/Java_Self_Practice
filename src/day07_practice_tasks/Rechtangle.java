package day07_practice_tasks;

public class Rechtangle {
    public double width;
    public double length;

    public double calculateArea() {
        return width * length;
    }

    public double calculatePerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rechtangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
