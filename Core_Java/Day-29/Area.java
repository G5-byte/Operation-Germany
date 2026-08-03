public class Area {
    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width){
        return length * width;
    }

    public static double calculateArea(double base, double height, boolean isTriangle){
        if(isTriangle){
            return 0.5 * base * height;
        }else{
            return base * height;
        }
    }

    public static int calculateArea(int side){
        return side * side;
    }

    public static void main(String[] args){
        double circleArea = calculateArea(5.0);
        System.out.println("Area of the circle: " + circleArea);

        double rectangleArea = calculateArea(4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        double triangleArea = calculateArea(3.0, 4.0, true);
        System.out.println("Area of the triangle: " + triangleArea);

        int squareArea = calculateArea(4);
        System.out.println("Area of the square: " + squareArea);
    }
    
} 

