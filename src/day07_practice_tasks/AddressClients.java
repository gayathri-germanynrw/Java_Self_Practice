package day07_practice_tasks;

public class AddressClients {
    public static void main(String[] args) {
        Address address1=new Address();
        address1.buildingNumber=1;
        address1.street="Car Strasse";
        address1.city="cologne";
        address1.state="NRW";
        address1.zipCode="50737";
        System.out.println("----------------------");
        Address address2=new Address();
        address2.buildingNumber=7925;
        address2.street="Jones Branch Dr ";
        address2.city="McLean";
        address2.state="VA";
        address2.zipCode="22012";
        System.out.println(address1);
        System.out.println("----------------------");
        System.out.println(address2);
    }
}
