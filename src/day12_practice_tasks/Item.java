package day12_practice_tasks;

public class Item {
    private String name;
    private int unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        char[] chArr=name.toCharArray();
        if (!Character.isLetter(name.charAt(0))) {
            System.err.println("Name should starts with letter\t" + name);
            System.exit(1);
        }
        if(name.isEmpty()||name.isBlank()) {
            System.err.println("Name should not be Empty or Blank\t" + name);
            System.exit(1);
        }

        for(int i=0;i<chArr.length;i++){
            if (!Character.isLetterOrDigit(chArr[i])){
                System.err.println("Name should not any special Character\t" + name);
                System.exit(1);
            }
        }

        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if(unitPrice<=0) {
            System.err.println("unitPrice can not be 0 or Negative\t" + unitPrice);
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0) {
            System.err.println("quantity can not be 0 or Negative\t" + quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public int calcCost(int unitPrice,int quantity)
    {
        return unitPrice*quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost is \t"+calcCost(unitPrice,quantity)+
                '}';
    }
}
