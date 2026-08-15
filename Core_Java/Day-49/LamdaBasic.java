interface Greetings {

    void sayHello();
    
}

class LamdaBasic{
    public static void main(String[] args){

        Greetings g = () -> System.out.println("Hello from Nikhil!");
        g.sayHello();
    }
}
