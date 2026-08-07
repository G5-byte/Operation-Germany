interface Remote {

    public void turnOn(); // interface method (does not have a body)
    public void turnOff(); // interface method (does not have a body)
    
}

class TV implements Remote{
    
    public void turnOn() {
        // The body of turnOn() is provided here
        System.out.println("The TV is turned on");
    }
    public void turnOff() {
        // The body of turnOff() is provided here
        System.out.println("The TV is turned off");
    }
}

class Main{

    public static void main(String[] args){
        
        TV myTV = new TV();  // Create a TV object
        myTV.turnOn();
        myTV.turnOff();
    }
}
