public class Car {

    private String brand;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setYear(2020);
        car.displayInfo();
    }
    
}
