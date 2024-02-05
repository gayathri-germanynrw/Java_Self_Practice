package day07_practice_tasks;

public class RechtangleClients {
    public static void main(String[] args) {
        Rechtangle recht = new Rechtangle();
        recht.length = 10.5;
        recht.width = 40_3;
        double result_area = recht.calculateArea();
        System.out.println("result_area = " + result_area);
        double result_perimeter = recht.calculatePerimeter();
        System.out.println("result_perimeter = " + result_perimeter);
        System.out.println(recht);
        System.out.println("-----------------------");

        Rechtangle recht2 = new Rechtangle();
        recht2.length = 4.0;
        recht2.width = 25_0;
        double result_area2 = recht2.calculateArea();
        System.out.println("result_area2 = " + result_area2);
        double result_perimeter2 = recht.calculatePerimeter();
        System.out.println("result_perimeter2 = " + result_perimeter2);
        System.out.println(recht2);
  }
}
