public class PrintMsg {
    public static void printMessage(){
        System.out.println("Hello, welcome to the Java programming world!");
    }

    public static void printMessage(String name){
        System.out.println("Hello " + name + ", welcome to the Java programming world!");
    }

    public static void printMessage(String name, int age){
        System.out.println("Hello " + name + ", you are " + age + " years old and welcome to the Java programming world!");
    }

    public static void main(String[] args){
        printMessage();
        printMessage("Nikhil");
        printMessage("Nikhil", 23);
 
    }

}