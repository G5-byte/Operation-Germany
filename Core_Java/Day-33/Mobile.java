public class Mobile {

    public void call(){
        System.out.println("Calling...");
    }   
    
}

class Smartphone extends Mobile {

    public void browse(){
        System.out.println("Browsing the internet...");
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.call();
        smartphone.browse();
    }
}
