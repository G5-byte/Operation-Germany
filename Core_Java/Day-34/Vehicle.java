public class Vehicle {

    public void start(){
        System.out.println("Vehicle starts.");
    }
    
}

class Car extends Vehicle{

    public void start(){
        System.out.println("Car starts moving");
    }

    public static void main(String[] args){

        Car Hyundai = new Car();
        Hyundai.start();

        Vehicle v1 = new Vehicle();
        v1.start();
    }
}
