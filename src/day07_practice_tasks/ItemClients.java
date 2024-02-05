package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {
        Item item=new Item();
        item.itemName="Monitors";
        item.unitPrice=30.0;
        item.quantity=6;
        item.calcCost();
        System.out.println(item);
}
}
