package day12_practice_tasks;

public class Candy {
    private String brand;
    private int quantity;
    private int price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.err.println("The quantity of candy cannot be set to zero or a negative value.\t" + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        if (price < 0) {
            System.err.println("The price of candy cannot be set to a negative value.\t" + price);
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public String calcPrice(int quantity, int price) {
        if (price != 0) {
            return "" + quantity * price;
        } else {
            return "It is free .";
        }
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ",calcPrice=" + calcPrice(quantity, price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
