public class Shape {

    public void draw() {
        System.out.println("Drawing a shape");
    }
    
}

class Circle extends Shape {

    public void draw() {
        System.out.println("Drawing a circle");
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Shape shape = new Shape();
        shape.draw();
    }
}
