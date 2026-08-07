public interface Printable {

    public void print();
}

interface Scannable {

    public void scan();
}

class MultiFunctionPrinter implements Printable, Scannable {

    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

class Main {
    public static void main(String[] args) {

        MultiFunctionPrinter myPrinter = new MultiFunctionPrinter();  // Create a MultiFunctionPrinter object
        myPrinter.print();
        myPrinter.scan();
    }
}