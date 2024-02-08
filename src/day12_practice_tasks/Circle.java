package day12_practice_tasks;

import static java.lang.Math.PI;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Radius value can not be 0 or Negative\t" + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(double radius) {
        System.out.println("radius = " + radius);
        return PI * radius * radius;
    }

    public double calcPerimeter(double radius) {
        return 2 * PI * radius;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Area of Circle is\t" + calcArea(radius) +
                ", Area of Perimeter is\t" + calcPerimeter(radius) +
                '}';
    }
}
