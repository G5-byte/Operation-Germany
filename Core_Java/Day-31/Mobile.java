public class Mobile {

    String brand;
    String model;
    int price;

    Mobile(){
        this("Samsung", "S25", 999);
    }

    Mobile(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args){

        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile("Samsung", "Galaxy S21", 799);

        mobile1.displayInfo();
        mobile2.displayInfo();
    }
    
}
