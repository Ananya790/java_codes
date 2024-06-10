import java.util.*;

class AreaCalculator {
    public double area(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double area(double base, double height) {
        return 0.5 * base * height;
    }

    public double area(int side) {
        return Math.pow(side, 2);
    }
}

public class AreaCalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");

        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                result = calculator.area(radius);
                break;

            case 2:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                result = calculator.area(base, height);
                break;

            case 3:
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                result = calculator.area(side);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Area: " + result);
    }
}