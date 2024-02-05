package day07_practice_tasks;

public class Address {
    public int buildingNumber;
    public String street, city, state, zipCode;

    public String toString() {
        return
                +buildingNumber + "\t" +
                        street + '\n' +
                        city + "\t" +
                        state + ",  " +
                        zipCode;

    }
}
