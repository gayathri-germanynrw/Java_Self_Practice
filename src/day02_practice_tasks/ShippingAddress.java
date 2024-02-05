package day02_practice_tasks;

public class ShippingAddress {
    public static void main(String[] args) {
        String fullName = "Aaron Kissinger";
        int buildingNumber = 13621;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        int zipCode = 22030;
        System.out.println("Your Shipping address is:\n\t"+fullName+
                "\n\t"+buildingNumber+"\t"+streetName+"\n\t"+city
        +","+state+"\t"+zipCode);
    }
}
