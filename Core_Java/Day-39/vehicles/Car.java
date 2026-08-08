package vehicles;

public class Car {

    public static void main(String[] args){
        Vehicles vehicle = new Vehicles();
        vehicle.start();
        Truck truck = new Truck();
        truck.start();
        truck.honk();
    }
    
}
