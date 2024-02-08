package day11_practice_tasks;

public class Pizza {
    public String size_Pizza;
    public int numOfCheeseTop;
    public int numOfPepperoniTop;

    public Pizza(String size_Pizza, int numOfCheeseTop, int numOfPepperoniTop) {
        this.size_Pizza = size_Pizza;
        this.numOfCheeseTop = numOfCheeseTop;
        this.numOfPepperoniTop = numOfPepperoniTop;
    }
    public static int calcCost(String size_Pizza, int numOfCheeseTop, int numOfPepperoniTop){
        int price_CheeseTop=2;
        int price_PepperoniTop=2;
        int price_pizza=(size_Pizza.equalsIgnoreCase("Small")?10:
                (size_Pizza.equalsIgnoreCase("Medium"))?12:
                        (size_Pizza.equalsIgnoreCase("Medium"))?14:0);
        return price_pizza+numOfCheeseTop*price_CheeseTop+
                numOfPepperoniTop*price_PepperoniTop;
    }

    public String toString() {
        return "Pizza{" +
                "size_Pizza='" + size_Pizza + '\'' +
                ", numOfCheeseTop=" + numOfCheeseTop +
                ", numOfPepperoniTop=" + numOfPepperoniTop +
                ", Pizza Cost  = $"+calcCost(size_Pizza,numOfCheeseTop,numOfPepperoniTop)+
                '}';
    }
}
