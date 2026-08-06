public class Circle1 {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        circle.setRadius(5.0);
        System.out.println("Area of the circle: " + circle.area() + "cm²");
    }

}
