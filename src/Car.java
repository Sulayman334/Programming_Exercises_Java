public class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double applyDiscount(double discountRate) {
        return price * (1 - discountRate);
    }

    public String displayDetails() {
        return "Brand: " + brand + "\nModel: " + model + "\nYear: " + year + "\nPrice: $" + price;
    }

    public static void main(String[] args) {

        Car car = new Car("Toyota","Lexus",2018,4500000);
        System.out.println(car.displayDetails());

        double discountedPrice = car.applyDiscount(0.5);
        System.out.println("Discounted Price: $" + discountedPrice);
    }
}
