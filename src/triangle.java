import java.util.Scanner;

class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lengths of the three sides of the triangle
        System.out.println("Enter the length of side 1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3:");
        double side3 = scanner.nextDouble();

        // Check if the sides form a valid triangle
        if (isValidTriangle(side1, side2, side3)) {
            // Determine the type of triangle
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is an equilateral triangle.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is an isosceles triangle.");
            } else {
                System.out.println("The triangle is a scalene triangle.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }

    // Method to check if the sides form a valid triangle
    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }
}