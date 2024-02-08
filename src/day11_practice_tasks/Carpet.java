package day11_practice_tasks;

public class Carpet {
    public int width;
    public int length;
    public int unitPrice;
    boolean isPersian;

    public Carpet(int width, int length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public int calcCost(int width, int length, int unitPrice, boolean isPersian) {
        int totalPrice = 0;
        if (isPersian == true) {
            totalPrice = (width * length) * unitPrice + 200;
        } else {
            totalPrice = (width * length) * unitPrice;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total price of Carpet = $ " + calcCost(width, length, unitPrice, isPersian) +
                '}';
    }
}
