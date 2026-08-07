interface Laptop{

    public void turnOn();
    public void boot();
    public void restart();
    public void turnOff();

}

class Dell implements Laptop{
    
    public void turnOn() {
        System.out.println("The Dell laptop is turned on");
    }
    public void boot() {
        System.out.println("The Dell laptop is booting up");
    }
    public void restart() {
        System.out.println("The Dell laptop is restarting");
    }
    public void turnOff() {
        System.out.println("The Dell laptop is turned off");
    }
}

class Main{
    public static void main(String[] args){

        Dell myDell = new Dell();  // Create a Dell object
        myDell.turnOn();
        myDell.boot();
        myDell.restart();
        myDell.turnOff();
    }
}