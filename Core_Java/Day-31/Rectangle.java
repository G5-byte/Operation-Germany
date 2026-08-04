public class Rectangle {

    double length;
    double width;

    Rectangle(){
        this(10.0, 5.0);
    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return length * width;
    }

    public static void main(String[] args){

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(15.0, 7.5);

        System.out.println("Area of rect1: " + rect1.area() + "cm²");
        System.out.println("Area of rect2: " + rect2.area() + "cm²");
    }

}
