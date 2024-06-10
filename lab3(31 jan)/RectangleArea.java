import java.util.Scanner;

class Rectangle {
    double length;
    double breadth;
    public Rectangle() {
        
        this.length = 0;
        this.breadth = 0;
    }

   
    public Rectangle(double length, double breadth) {
        
        this.length = length;
        this.breadth = breadth;
    }

    
    public double calculateArea() {
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle defaultRectangle = new Rectangle();
        System.out.println("Area of default rectangle: " + defaultRectangle.calculateArea());
        System.out.print("Enter length of the rectangle: ");
        double userLength = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double userBreadth = scanner.nextDouble();
        Rectangle userRectangle = new Rectangle(userLength, userBreadth);
        System.out.println("Area of user-defined rectangle: " + userRectangle.calculateArea());
    }
}