import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter three side lengths: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            
            if (a <= 0 || b <= 0 || c <= 0
                    || a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Invalid Triangle");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}