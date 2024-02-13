package day13_practice_tasks.phone_tasks;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    public Phone(String brand, String model, String size, double price, String color) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);
    }

    public void call(int phoneNumber){
        System.out.println(" Calling the Number "+phoneNumber);
    }
    public void text(int phoneNumber){
        System.out.println(" Texting the Number "+phoneNumber);
    }





    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null || brand.isEmpty()||brand.isBlank()){
            throw new RuntimeException(" Brand can not be null or empty or Blank ");
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null || model.isEmpty()||model.isBlank()){
            throw new RuntimeException(" model can not be null or empty or Blank ");
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Price can not be negative ");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null || color.isEmpty()||color.isBlank()){
            throw new RuntimeException(" color can not be null or empty or Blank ");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
