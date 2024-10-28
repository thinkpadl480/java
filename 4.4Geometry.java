import java.util.Scanner;

class AreaCalculator {
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator areaCalculator = new AreaCalculator();

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();
        System.out.printf("Circle Area: %.2f\n", areaCalculator.calculateCircleArea(radius));

        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.printf("Rectangle Area: %.2f\n", areaCalculator.calculateRectangleArea(length, width));

        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();
        System.out.printf("Triangle Area: %.2f\n", areaCalculator.calculateTriangleArea(base, height));
    }
}
