@FunctionalInterface
interface Message{

    void display(String text);
}

class FunctionalInterfaceDemo{
    public static void main(String[] args) {
        
        Message message = text -> System.out.println("Message : " + text);
        message.display("Working on Lamda Expressions");
    }
}