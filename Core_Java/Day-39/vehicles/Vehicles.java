package vehicles;

public class Vehicles {

    public void start() {
        System.out.println("Vehicle is starting");
    }
    
}

class Truck extends Vehicles {
   
    public void honk() {
        System.out.println("Truck is honking");
    }
}